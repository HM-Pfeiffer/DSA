class Solution {
    /**
    @param int[] nums
    @return Map<Integer, Integer> map

    creates a new map from a integer array
    */ 
    public Map<Integer, Integer> mapMaker(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();

        for (int n : nums) {
            int total = map.getOrDefault(n, 0) + 1;
            map.put(n, total);
        }
        return map;
    }
    
    /**
    @param  Map<Integer, Integer> map
    @return int majority 

    finds the highest value in a map and returns its key
    */ 
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

    /**
    @param  int[] nums 
    @return int majority 

    takes in an array of int and returns the most frequent value by calling helper functions
    */ 
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = mapMaker(nums);
        int majority = findMostFrequentValue(map);
    
        return majority;
    }
}
