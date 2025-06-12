import java.util.*;
/**
    Step 1: Sort by start time
    Step 2: Min-heap to track the earliest end time
    Step 3: Iterate through meetings
            - If the room is free, remove the old end time
            - Allocate room (add current meeting’s end time)
    Step 4: Heap size is the number of rooms needed
 */
class Solution {
    public int minMeetingRooms(int[][] intervals) {
        if (intervals == null || intervals.length == 0) return 0;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for (int[] interval : intervals) {
            if (!heap.isEmpty() && heap.peek() <= interval[0]) {
                heap.poll();
            }
            heap.offer(interval[1]);

            for (Integer n : heap) {
                System.out.println("number is: " + n);
            }
        }
        return heap.size();
    }
}
