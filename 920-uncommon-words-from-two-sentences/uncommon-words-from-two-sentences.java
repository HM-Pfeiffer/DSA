/**
    step 1: create a hashmap that will store the string, int freq of each word, declare a result array
    step 2: iterate through the input string and populate hashmap 
    step 3: iterate through values
                // if the value is greater than one, push to result array
    step 4: return String[] result
 */

class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> result = new ArrayList<>();
        HashMap<String,Integer> wordFrequency = new HashMap<>();
        String[] s1Words = s1.split("\\s+");
        String[] s2Words = s2.split("\\s+");

        for (String str : s1Words) {
            wordFrequency.put(str, wordFrequency.getOrDefault(str, 0) + 1);
        }

        for (String str : s2Words) {
            wordFrequency.put(str, wordFrequency.getOrDefault(str, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            String word = entry.getKey();
            int freq = (int) entry.getValue();
            if (freq == 1) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
}