class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int length=nums.length;
        for(int n:nums){
            sum+=n;
        }
        return ((length*(length+1))/2)-sum;
        
    }
}