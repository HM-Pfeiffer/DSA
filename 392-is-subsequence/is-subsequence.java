class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.isEmpty() || (s.length() == 1 && t.contains(s))) return true;
        int s_index = 0;

        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) == s.charAt(s_index)){
                s_index += 1;
            }
            if (s_index == s.length()) return true;
        }
        return s_index == s.length();
    }
}