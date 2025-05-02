class Solution {

    public int singleNumber(int[] nums) {
        int res = 0; 
        for(int num : nums){
            res ^= num;
        }
        return res;
    }
}




/**
Alternatively: 

    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            if(!set.contains(num)){
                set.add(num);
            } else{
                set.remove(num);
            }
        }
        return set.iterator().next();
    }  

*/
