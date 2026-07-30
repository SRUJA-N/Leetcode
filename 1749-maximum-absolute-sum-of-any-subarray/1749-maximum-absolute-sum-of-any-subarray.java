class Solution {
    public int maxAbsoluteSum(int[] nums) {
        if(nums.length==1) return Math.abs(nums[0]);
        int best=nums[0];
        int min=nums[0];
        int res=Math.abs(nums[0]);
        for(int i=1;i<nums.length;i++){
            best=Math.max(best+nums[i],nums[i]);
            int temp=Math.min(min+nums[i],nums[i]);
            min=temp;
            res=Math.max(res,Math.max(Math.abs(min),Math.abs(best)));
        }
        return res;
    }
}