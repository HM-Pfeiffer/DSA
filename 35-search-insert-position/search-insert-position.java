/**
    step 1: declare the mid, l and r pointers (beg and end of target)
    step 2: iterate through nums - while l < r
                // divide and conquer - adjust midpoint
                // if mid is the target OR 
                    //mid - 1 is smaller than target and mid + 1 is greater thabn target
                        // return mid 
                // ie if mid is greater than target, mid = r - 1
                // else mid = l + 1
    step 3: return -1 
 */

class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }
}