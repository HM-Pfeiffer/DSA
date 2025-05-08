class Solution {
    public int strStr(String haystack, String needle) {
        int needleLength = needle.length();
        int haystackLength = haystack.length();
        String substring;

        if(haystackLength == 1){
            return haystack.equals(needle) ? 0 : -1;
        }
        for(int i = 0; (i + needleLength - 1) < haystackLength; i++){
            substring = haystack.substring(i, needleLength + i);
            System.out.println(substring);
            System.out.println(i);
            if(substring.equals(needle)){
                return i;
            }
        }
        return -1;
    }
}