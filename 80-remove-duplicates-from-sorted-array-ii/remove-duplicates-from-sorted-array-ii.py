class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        map = {}
        k = 0

        for i in range(len(nums)):
            n = nums[i]
            map[n] = map[n] + 1 if n in map else 1

            if (i == 0) or (n in map and map[n] < 3):
                nums[k] = n
                k += 1
        
        return k