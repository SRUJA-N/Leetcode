class Solution {
    public boolean helper(int[][] a,int mid,int k)
    {
        int count=0;
        int row=a.length-1;;
        int cols=0;
        while(row>=0 && cols<a[0].length){
            if(a[row][cols]>mid){
                row=row-1;
            }else{
                count=count+row+1;
                cols=cols+1;
            }
        }
        return k<=count;
    }
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix[0].length-1;
        int low=matrix[0][0];
        int res=0;
        int high=matrix[n][n];
        while(low<=high){
            int mid=low+(high-low)/2;
            if(helper(matrix,mid,k)){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;
    }
}