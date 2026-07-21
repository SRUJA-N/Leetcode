class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 1) return nums[0];
        int mins=nums[0];
        int maxs=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int temp=Math.max(nums[i],Math.max(nums[i]*maxs,nums[i]*mins));
            mins=Math.min(nums[i],Math.min(nums[i]*maxs,nums[i]*mins));
            maxs=temp;
            result=Math.max(result,maxs);
        }
  return result;

    }
}