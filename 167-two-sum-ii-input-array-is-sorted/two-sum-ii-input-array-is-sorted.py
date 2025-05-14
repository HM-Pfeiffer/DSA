class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        r_pointer, l_pointer = 0, len(numbers) - 1

        while r_pointer < l_pointer:
            total = numbers[r_pointer] + numbers[l_pointer]
            if total > target: 
                l_pointer -= 1
            elif total < target:
                r_pointer += 1
            else:
                return [r_pointer + 1, l_pointer + 1]
        
        return []
        