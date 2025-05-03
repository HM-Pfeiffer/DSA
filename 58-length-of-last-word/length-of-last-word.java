class Solution {
    public int lengthOfLastWord(String s) {
        int size = s.length();
        int res = 0; 

        for(int i = 0; i < size; i++) {
            char currentLetter = s.charAt(size - 1 - i);
            if (currentLetter == ' ' && res == 0) {
                continue;
            }
            else if (currentLetter == ' ') {
                return res;
            } 
            res += 1;
        }
        return res;
    }
}