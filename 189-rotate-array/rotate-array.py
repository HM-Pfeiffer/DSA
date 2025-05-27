class Solution:
    def reverse(self, nums: List[int], l: int, r: int) -> List[int]:
        while l < r:    # iterate until two points cross at the middle
            nums[l], nums[r] = nums[r], nums[l]   # In Python has 'under-the-hood temp var' that allows a one-liner to swap variables 
            l += 1  # purposely updating l and r to separately lines to reduce need for under-the-hood tuple
            r -= 1

    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if k == 0:
            return

        length = len(nums)
        k %= length                          # Step 1: adjust for multiple rotations 
        self.reverse(nums, 0, length - 1)    # Step 2: reverse whole input array
        self.reverse(nums, 0, k - 1)         # Step 3: reverse first half of array
        self.reverse(nums, k, length - 1)    # Step 4: reverse latter half of array
        


            