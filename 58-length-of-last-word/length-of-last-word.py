class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        reverse_s = s[::-1]
        i, length = 0, 0

        while reverse_s[i] == ' ':
            i += 1

        while i < len(s) and reverse_s[i] != ' ':
            length += 1
            i += 1
        
        return length


        