class Solution {
    public int maxSubArray(int[] nums) {
       
        int res=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++)
        {
           
           ans=Math.max(nums[i],nums[i]+ans);
           res=Math.max(res,ans);

        }
        return res;
    }
}