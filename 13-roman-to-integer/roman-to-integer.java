/**
    @param - string 
    @return - number 
 */

class Solution {
    private final Map<Character, Integer> romanNumerals = Map.of(
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
            int prevNumberValue = romanNumerals.get(chars[i - 1]); 

            if (i != length) {
                int currentNumberValue = romanNumerals.get(chars[i]); 
                if (prevNumberValue < currentNumberValue) {
                    prevNumberValue *= -1;
                }
            }

            resultSum += prevNumberValue;
        }
        return resultSum;
    }
}