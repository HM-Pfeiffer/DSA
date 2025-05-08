class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 2;
        int length = nums.length;

        for(int i = 2; i < length; i++){
            if(nums[i] != nums[k-2]){
                nums[k] = nums[i];
                k += 1;
            }
        }
        return k;
    }
}