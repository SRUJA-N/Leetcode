class Solution {
    public int[] sortedSquares(int[] nums) {

        int[] result=new int[nums.length];

        int left=0;
        int right=nums.length-1;
        int k=right;


        while(left<=right){
            int L=nums[left]*nums[left];
             int R=nums[right]*nums[right];

             if(R>L){
                result[k]=R;
                right--;
                k--;

             }else{
                result[k]=L;
                left++;
                k--;
             }

        }
        return result;
        
      
    }
}