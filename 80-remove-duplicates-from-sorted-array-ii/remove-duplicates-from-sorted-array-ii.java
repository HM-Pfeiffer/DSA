class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int value, n;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            n = nums[i];
            value = map.containsKey(n) ? map.get(n) + 1 : 1;
            map.put(n, value);

            if(i == 0 || (map.containsKey(n) && value < 3)){
                nums[k] = n;
                k += 1;
            }
        }
        return k;
    }
}