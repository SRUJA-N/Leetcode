class Solution {
    public int removeDuplicates(int[] nums) {
        int cur_ans=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=cur_ans)

            {
                nums[count]=nums[i];
                count++;
                cur_ans=nums[i];
            }
        }
        return count;
    }
}