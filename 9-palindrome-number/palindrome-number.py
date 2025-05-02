class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        return x == int(str(x)[::-1])


# alternatively logic
# if x < 0: return False

# str_num = str(x)
# mid_len = len(str_num)

# for i in range(mid_len):
#     if str_num[i] != str_num[-1-i]:
#         return False

# return True

