class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> myNumsSet = new HashSet<>();

        for(int num : nums){
            if (myNumsSet.contains(num)){
                return true;
            }
            myNumsSet.add(num);
        }
        return false;
    }
}