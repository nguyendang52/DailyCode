


'''Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().'''


class Solution(object):
    def strStr(self, haystack, needle):
        if needle == '' :
            return 0
        if needle == haystack:
            return 0
        lenNeedle = len(needle)
        lenHayStack = len(haystack)
        for i in range(0, lenHayStack-lenNeedle+1) :
            str = haystack[i:i+lenNeedle]

            print(str)
            if str == needle :
                return i
        
        return -1

s = Solution()
print(s.strStr('abc', 'c'))      