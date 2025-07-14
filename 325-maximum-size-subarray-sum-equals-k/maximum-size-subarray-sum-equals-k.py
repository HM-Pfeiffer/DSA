class Solution:
    def maxSubArrayLen(self, nums: List[int], k: int) -> int:
        prefix_sum = {0: -1}
        max_size, current_sum = 0, 0
        
        for i, num in enumerate(nums):
            current_sum += num
            complement = current_sum - k

            if complement in prefix_sum:
                max_size = max(max_size, i - prefix_sum[complement])

            if current_sum not in prefix_sum:
                prefix_sum[current_sum] = i

        return max_size
        