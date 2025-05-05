class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        prefix = ""
        length = len(min(strs, key=len))

        for i in range(length):
            for s in strs:
                if s[i] != strs[0][i]:
                    return prefix
            prefix += strs[0][i]
            
        return prefix
            


        