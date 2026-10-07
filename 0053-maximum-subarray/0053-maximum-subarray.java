class Solution {
    public int maxSubArray(int[] nums) {
        int best=nums[0];
        int res=nums[0];
        int cur=0;

        for(int num:nums)
        {
            cur=cur+num;
            cur=Math.max(num,cur);
            res=Math.max(res,cur);
        }
        return res;
    }
}