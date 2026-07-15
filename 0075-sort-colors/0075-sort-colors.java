class Solution {
    public void sortColors(int[] nums) {
        int left=0,right=nums.length-1,mid=0;
        
        while(mid<=right){
            
            if(nums[mid]==2){
                swap(nums,mid,right);
                right--;
            
                
            }else if(nums[mid]==0){
                swap(nums,mid,left);
                left++;
                mid++;
            
            }else{
                mid++;
            }
            
            
        }

        


        
    }
    public void swap(int[] nums,int mid,int left){
        int temp=nums[mid];
                nums[mid]=nums[left];
                nums[left]=temp;
    }
}