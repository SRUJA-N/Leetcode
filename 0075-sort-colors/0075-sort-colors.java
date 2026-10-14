class Solution {
    public void sortColors(int[] nums) {


            int left=0;
            int right=nums.length-1;
            int mid=0;

            while(mid<=right){
                if(nums[mid]==0){
                     swap(left,mid,nums);
                    left++;
                    mid++;
                }else if(nums[mid]==2){
                    swap(right,mid,nums);
                    right--;

                }else{
                    mid++;
                }
            }

       

        


        
    
  
    
    }
    public void swap(int p1,int p2,int[] nums){
        int temp=nums[p1];
        nums[p1]=nums[p2];
        nums[p2]=temp;
    }
}
