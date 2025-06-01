class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<>();
        int[] alphabet = new int[26];

        for(String s: strs){
            Arrays.fill(alphabet, 0);
            for(char c: s.toCharArray()){
                alphabet[c - 'a']++;
            }

            String key = Arrays.toString(alphabet);
            anagramsMap.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(anagramsMap.values());
    }
}