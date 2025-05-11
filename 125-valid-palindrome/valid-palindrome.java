class Solution {
    
    public boolean isPalindrome(String s) {
        if (s.isBlank()) return true;
        StringBuilder clean_sb = stringDataCleaner(s);
        StringBuilder clean_reversed_sb = stringDataCleaner(s).reverse();
        return clean_sb.compareTo(clean_reversed_sb) == 0 ? true : false;
    }

    public StringBuilder stringDataCleaner(String s){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                char c = Character.toLowerCase(s.charAt(i));
                sb.append(c);
            }
        }
        return sb;
    }
}
