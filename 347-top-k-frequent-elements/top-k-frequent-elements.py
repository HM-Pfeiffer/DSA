from collections import Counter

class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        # count the frequency of the elements of nums
        count = Counter(nums)

        # use a heap to get the k most frequent nums
        return [item for item, freq in count.most_common(k)]


        