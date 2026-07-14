class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
            
            if(k<=1) return 0;

            int count=0;
            int left=0;
            int curr=1;

            for(int right=0;right<nums.length;right++)
            {
                curr=curr*nums[right];

                while(curr>=k  && left<=right)
                {
                    curr=curr/nums[left];
                    left++;
                    
                }
                count+=(right-left+1);

            }
          


            return count;
    }
   
}