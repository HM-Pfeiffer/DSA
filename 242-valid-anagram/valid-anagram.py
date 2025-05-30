class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        return ''.join(sorted(t)) == ''.join(sorted(s))


        