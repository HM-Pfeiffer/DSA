class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastIndex = new int[128];  // supports ASCII, including space
        Arrays.fill(lastIndex, -1);

        int maxLen = 0, start = 0;
        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (lastIndex[c] >= start) {
                // Move the start past the last occurrence of c
                start = lastIndex[c] + 1;
            }
            // Update max length
            maxLen = Math.max(maxLen, end - start + 1);
            // Record the last seen index of c
            lastIndex[c] = end;
        }
        return maxLen;
    }
}