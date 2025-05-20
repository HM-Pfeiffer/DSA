class Solution:
    def __init__(self):
        self.res = ""
        self.resLen = 0

    def checkSubstringsForPalindromes(self, s: str, l: int, r: int) -> None:
        while l >= 0 and r < len(s) and s[l] == s[r]:
            if (r - l + 1) > self.resLen:
                self.res = s[l:r+1]
                self.resLen = r - l + 1
            l -= 1
            r += 1
    
    def longestPalindrome(self, s: str) -> str:
        s_len = len(s)
            
        for i in range(s_len):
            # assign l and r pointers based on even or odd 
            self.checkSubstringsForPalindromes(s, i, i)
            self.checkSubstringsForPalindromes(s, i, i + 1)

        return self.res

