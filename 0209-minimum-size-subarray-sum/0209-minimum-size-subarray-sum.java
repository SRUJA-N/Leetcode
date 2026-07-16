class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int low=0,high=0,res=Integer.MAX_VALUE,sum=0; 
      while(high<nums.length)
      {
        sum=sum+nums[high];
        while(sum>=target)
        {
            res=Math.min(res,(high-low+1));
            low++;
            sum=sum-nums[low-1];
        }
        high++;
      }

      return res == Integer.MAX_VALUE ? 0:res;

    }
}