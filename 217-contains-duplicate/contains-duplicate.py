class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        myNumsSet = set()

        for num in nums: 
            if num in myNumsSet:
                return True
            myNumsSet.add(num)

        return False
        
