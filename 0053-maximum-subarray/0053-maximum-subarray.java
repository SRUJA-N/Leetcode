class Solution {
    public int maxSubArray(int[] nums) {
       int res=-10000000;
       int best=-1000000;
       
       for(int num:nums){
        best+=num;
        best=Math.max(best,num);
        res=Math.max(res,best);
       }
       return res;
    }
}