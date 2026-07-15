class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
       int high=0,low=0,n=nums.length,res=Integer.MAX_VALUE,sum=0;
       

        while(high<n)
        {
            sum=sum+nums[high];
            
            while(sum>=target)
            {
                res=Math.min((high-low+1),res);
                sum=sum-nums[low];
                low++;

            }
            high++;

        }
        return res == Integer.MAX_VALUE ? 0 : res;


    }
}