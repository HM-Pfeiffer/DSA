class Solution:
    def __init__(self):
        self.nums = []

    def reverse(self, l: int, r: int) -> None:
        while l < r:
            self.nums[l], self.nums[r] = self.nums[r], self.nums[l]
            l, r = l + 1, r - 1

    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        self.nums = nums
        length = len(self.nums)
        
        if length >= 2 or k != 0:
            k = k % length
            self.reverse(0, length - 1)
            self.reverse(0, k - 1)
            self.reverse(k, length - 1)
        


            