class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<>();

        for(String s: strs){
            int[] alphabet = new int[26];
            for(char c: s.toCharArray()){
                alphabet[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder();
            for (int count : alphabet) {
                sb.append(count).append('#'); // '#' ensures uniqueness
            }
            String key = sb.toString();
            // String key = Arrays.toString(alphabet);
            anagramsMap.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(anagramsMap.values());
    }
}