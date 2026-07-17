class Solution {
    public int findDuplicate(int[] nums) {
        int slow=0;
        int fast=0;
        while(true){
            slow=nums[slow];
            fast=nums[fast];
            fast=nums[fast];
            if(nums[slow]==nums[fast]){
                slow=0;
                while(nums[slow]!=nums[fast]){
                    fast=nums[fast];
                    slow=nums[slow];
                }
                return nums[slow];
            }
        }
       
    }
}