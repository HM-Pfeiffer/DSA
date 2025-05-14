class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int r_pointer = 0;
        int l_pointer = numbers.length - 1;

        while (r_pointer < l_pointer){
            int total = numbers[r_pointer] + numbers[l_pointer];
            if (total > target) {
                l_pointer -= 1;
            }
            else if (total < target) {
                r_pointer += 1;
            }
            else {
                return new int[] {r_pointer + 1, l_pointer + 1};
            }
        }
        return new int[0];
    }
}