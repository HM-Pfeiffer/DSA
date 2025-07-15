/**
    @param - string 
    @return - number 
 */

class Solution {
    private final Map<Character, Integer> numerals = Map.of(
        'I', 1,
        'V', 5, 
        'X', 10, 
        'L', 50, 
        'C', 100, 
        'D', 500, 
        'M', 1000
    );

    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int length = chars.length;
        int resultSum = 0;

        for (int i = 1; i <= length; i++) {
            if (i != length && numerals.get(chars[i - 1]) < numerals.get(chars[i])) {
                resultSum -= numerals.get(chars[i - 1]);
            } else {
                resultSum += numerals.get(chars[i - 1]);
            }
        }
        return resultSum;
    }
}