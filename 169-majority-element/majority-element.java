class Solution {

    public Map<Integer, Integer> mapMaker(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            int total = map.getOrDefault(n, 0) + 1;
            map.put(n, total);
        }
        return map;
    }

    public int findMostFrequentValue(Map<Integer, Integer> map){
        int max_count = 0;
        int majority = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max_count) {
                majority = entry.getKey();
                max_count = entry.getValue();
            }
        }
        return majority;
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = mapMaker(nums);
        int majority = findMostFrequentValue(map);
    
        return majority;
    }
}