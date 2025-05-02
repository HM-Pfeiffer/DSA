class Solution {
    
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        String intToStr = Integer.toString(x);
        StringBuilder sb = new StringBuilder(intToStr).reverse();
        String sbReverseToStr = sb.toString();
        return intToStr.equals(sbReverseToStr);
    }
}
