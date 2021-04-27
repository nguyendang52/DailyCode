class Solution(object):
    def lengthOfLongestSubstring(self, s):
        start = result = 0
        used = {}
        for idx, char in enumerate(s) :
            if char in used and start <= used[char]:
                start = used[char] + 1
            else :
                result = max(result, idx - start + 1)
            used[char] = idx
        return result
s = Solution()
print(s.lengthOfLongestSubstring("dvdffabcee"))

