class Solution {
    public int[] twoSum(int[] nums, int target) {
         int left=0;
         int right=nums.length-1;
         int current_sum=0;

            while(left<right)
            {
                current_sum=nums[left]+nums[right];
                if(current_sum==target)
                {
                    return new int[]{left+1,right+1};
                }else if(current_sum>target)
                {
                    right--;
                }else{
                    left++;
                }
            }
        return new int[]{-1,-1};
    }
}