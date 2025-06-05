class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        left_sum = 0
        global_sum = sum(nums)

        for i, num in enumerate(nums):
            if global_sum - (left_sum * 2) == num:
                return i
            left_sum += num  
        
        return -1
