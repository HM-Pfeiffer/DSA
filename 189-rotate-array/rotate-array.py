class Solution:
    def reverse(self, nums: List[int], l: int, r: int) -> List[int]:
        while l < r:
            nums[l], nums[r] = nums[r], nums[l]
            l, r = l + 1, r - 1
        return nums

    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        length = len(nums)
        if length < 2 or k == 0:
            return

        k = k % length
        nums = self.reverse(nums, 0, length - 1)
        nums = self.reverse(nums, 0, k - 1)
        nums = self.reverse(nums, k, length - 1)
        


            