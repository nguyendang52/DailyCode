class Solution(object):
    def removeElement(self, nums, val):
        # bien i dung de xac dinh vi tri trung lap
        i = 0
        for j in range(0, len(nums)) :
            if nums[j] != val :
                nums[i] = nums[j]
                i = i+1
        return i
    
    
                