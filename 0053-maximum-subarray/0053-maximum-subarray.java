class Solution {
    public int maxSubArray(int[] nums) {
        int best=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
 best=best+nums[i];
            int cur=nums[i];
            best=Math.max(best,cur);
            result=Math.max(best,result);
        }
        return result;
    }
}