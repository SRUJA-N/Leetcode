class Solution {
    public int maximumSum(int[] arr) {
       int del=0;
       int normal=arr[0];
       int maxxy=arr[0];
       for(int i=1;i<arr.length;i++){
        del=Math.max(del+arr[i],normal);
        normal=Math.max(normal+arr[i],arr[i]);
        maxxy=Math.max(maxxy,Math.max(del,normal));
       }
       return maxxy;
    }
}