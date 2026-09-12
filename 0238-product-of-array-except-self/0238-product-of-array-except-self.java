class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix=new int[nums.length];
        int[] suffix=new int[nums.length];
        int presum=1;
        int sufsum=1;

        for(int i=0;i<nums.length;i++){
            
            prefix[i]=presum;
            presum*=nums[i];
        }

        for(int i=nums.length-1;i>=0;i--){
            suffix[i]=sufsum;
            sufsum*=nums[i];
        }

        int[] res=new int[nums.length];
        for(int j=0;j<nums.length;j++){
            res[j]=suffix[j]*prefix[j];
        }
        return res;

    }
}