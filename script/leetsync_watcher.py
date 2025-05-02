import os
import shutil
from watchdog.observers import Observer
from watchdog.events import FileSystemEventHandler
import time

# Define the directory where LeetCode submissions are stored
LEETSYNC_DIR = "DSA/LeetSync"  # Update this with your actual directory

# Define the mapping of file extensions to language folders
LANGUAGE_FOLDERS = {
    '.py': 'python',
    '.java': 'java',
    '.cpp': 'cpp',
    '.js': 'javascript',
    '.ts': 'typescript',
    '.cs': 'csharp'
}

class LeetSyncHandler(FileSystemEventHandler):
    def on_created(self, event):
        if event.is_directory:
            return  # Ignore directories

        # Get the file extension and decide the destination folder
        filename = os.path.basename(event.src_path)
        _, ext = os.path.splitext(filename)
        language_folder = LANGUAGE_FOLDERS.get(ext)

        if language_folder:
            # Create the folder if it doesn't exist
            dest_folder = os.path.join(LEETSYNC_DIR, language_folder)
            os.makedirs(dest_folder, exist_ok=True)

            # Move the file to the appropriate folder
            dest_path = os.path.join(dest_folder, filename)
            shutil.move(event.src_path, dest_path)

            print(f"Moved {filename} → {language_folder}/")

if __name__ == "__main__":
    # Create an observer to monitor the LeetSync directory
    event_handler = LeetSyncHandler()
    observer = Observer()
    observer.schedule(event_handler, path=LEETSYNC_DIR, recursive=False)
    observer.start()

    print("🔍 Watching for new LeetSync files...")

    try:
        while True:
            time.sleep(1)  # Keeps the observer running
    except KeyboardInterrupt:
        observer.stop()  # Stop the observer on interrupt
    observer.join()  # Wait for the observer to finish
