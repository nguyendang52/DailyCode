class Solution(object):
    def romanValue(self,c):
        thisdict = { "I" : 1, "V" : 5, "X" : 10, "L" : 50, "C" : 100, "D" : 500, "M" : 1000}
        return thisdict[c]
    def romanToInt(self, s):
        realNumber = 0
        i = 0
        if len(s) == 1:
            return self.romanValue(s[i])
        while i < len(s)-1 :
            pre = self.romanValue(s[i])
            next = self.romanValue(s[i+1])
            if i == len(s) -2 and pre>= next:
                realNumber = realNumber + next
            if pre < next:
                realNumber = realNumber + next - pre
                i = i+2
                if i == len(s)-1:
                    realNumber = realNumber + self.romanValue(s[i])
            else :
                realNumber += pre
                i = i + 1
        return realNumber
s = Solution()
print(s.romanToInt("XVI"))
