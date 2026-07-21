class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 1) return nums[0];
        int mins=nums[0];
        int maxs=nums[0];
        int result=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            int a=nums[i];
            int b=mins*a;
           
            int c=maxs*a;

            maxs=Math.max(a,Math.max(b,c));

            mins=Math.min(a,Math.min(b,c));

           
            
            result=Math.max(result,maxs);
        }
        return result;
    
    

    }
}