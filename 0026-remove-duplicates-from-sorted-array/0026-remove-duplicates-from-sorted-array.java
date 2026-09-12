class Solution {
    public int removeDuplicates(int[] nums) {
        int res=1;
        int num=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=num){
                nums[res]=nums[i];
                res++;
                num=nums[i];
            }
        }
        return res;
    }
}