class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int value;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            value = map.containsKey(nums[i]) ? map.get(nums[i]) + 1 : 1;
            map.put(nums[i], value);
            
            if(i == 0 || (map.containsKey(nums[i]) && map.get(nums[i]) < 3)){
                nums[k] = nums[i];
                k += 1;
            }
        }
        return k;
    }
}