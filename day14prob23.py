class Solution(object):
    
    def palindromic(self, s):
        for i in range(len(s)) :
            j = len(s)-i-1 
            if s[i] != s[j] :
                return False
        return True

    

    def longestPalindrome(self, s):
        if s == "" : 
            return ""
        if len(s) == 1:
            return s
        if len(s) == 2:
            if s[0] == s[1]:
                return s
            return s[0]


        str = ""
        
        length = 0
        for i in range(len(s)):
            temp = ""
            for j in range(i, len(s)-1):
                if s[j] in temp and j-i+1 > length and self.palindromic(s[i:j+1])== True:
                    str = s[i:j+1]
                    length = len(str)
                else :
                    temp = temp + s[j]
        return str 

s = Solution()
str = "ab"
print(str[0:1])
print(s.palindromic("aa"))