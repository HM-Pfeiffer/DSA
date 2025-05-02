class Solution {
    public int singleNumber(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        Arrays.sort(nums);

        for(int num : nums){
            if(!stack.isEmpty() && stack.peek() == num){
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        return stack.pop();
    }
}