public class day12prob21 {
    public int searchInsert(int[] nums, int target) {
        
        int k = nums.length;
        if(target > nums[k-1]){
            return nums.length;
        }
        for(int i = 0;i < nums.length; i++){
           if(nums[i] == target){
               return i;
           }
           else if(nums[i]>target){
               return i;
           }
        }
        return -1;
    }
}