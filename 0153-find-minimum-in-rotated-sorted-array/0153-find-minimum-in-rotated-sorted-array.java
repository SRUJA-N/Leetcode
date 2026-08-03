class Solution {
    public int findMin(int[] arr) {
        if(arr.length==1) return arr[0];
         int left=0;
        int res=0;
        int right=arr.length-1;
        if(arr[0]<arr[right]) return arr[0];
        while(left<right){
            int mid=left+(right-left)/2;
            if(arr[mid]>arr[right]){
               
                left=mid+1;
            }else{
                
                right=mid;
            }
        }
        return arr[left];
        
    }
}