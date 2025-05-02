class Solution {
    
    public boolean isPalindrome(int x) {
        // check if x is below 0, if negative return false
        if (x < 0) return false;

        // compare input string and string x in reverse 
        String intToStr = Integer.toString(x);
        StringBuilder sb = new StringBuilder(intToStr).reverse();
        String sbReverseToStr = sb.toString();

        return intToStr.equals(sbReverseToStr);
    }
}