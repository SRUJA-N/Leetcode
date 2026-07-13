class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] arr=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int k=right;
        while(left<right)
        {
            int ls=nums[left]*nums[left];
            int rs=nums[right]*nums[right];

            if(ls>rs){
                arr[k--]=ls;
                left++;

            }else{
                arr[k--]=rs;
                right--;
            }
        }
        arr[0]=nums[left]*nums[left];
        return arr;
    }
}