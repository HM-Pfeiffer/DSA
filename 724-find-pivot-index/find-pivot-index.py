class Solution(object):
    def pivotIndex(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        global_sum = sum(nums)
        left_sum = 0

        for i, n in enumerate(nums):
            if global_sum - (2 * left_sum) == n:
                return i

            left_sum += n
        
        return -1