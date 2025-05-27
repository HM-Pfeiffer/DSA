class Solution:
    def reverse(self, nums: List[int], l: int, r: int) -> List[int]:
        while l < r:
            nums[l], nums[r] = nums[r], nums[l]
            l += 1
            r -= 1

    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if k == 0:
            return

        length = len(nums)
        k %= length
        self.reverse(nums, 0, length - 1)
        self.reverse(nums, 0, k - 1)
        self.reverse(nums, k, length - 1)
        


            