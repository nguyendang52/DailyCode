class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        
        for i in range(len(nums)):
             
            # If K is found
            if nums[i] == target:
                return i
        # If arr[i] exceeds K
            elif nums[i] > target:
                return i
            
    
nums = [1,3,5,6]
target = 0
x = Solution()
print(x.searchInsert(nums, target))
