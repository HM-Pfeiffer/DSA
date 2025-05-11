class Solution:
    def isPalindrome(self, s: str) -> bool:
        # if s is empty string return true 
        if s == '': return True

        # remove all non-alphanumeric char and to create lowercase
        alphanum_palin = ''.join(char for char in s if char.isalnum()).lower()
        # declare a mid_len var to hold the val of 1/2 the length 
        mid_len = len(alphanum_palin) // 2

        # iterate through s up to mid_len
        for i in range(mid_len):
            # check whether the first and last letters are the same 
            if alphanum_palin[i] != alphanum_palin[-1-i]:
                # if not return false
                return False
        
        # return true
        return True