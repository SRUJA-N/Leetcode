class Solution {
    public boolean helper(int m,int n,int k,int mid){
        int count=0;
        int row=m,cols=1;
        while(row>=1 && cols<=n){
            if((row*cols)>mid){
                row=row-1;
            }else{
                count=row+count;
                cols+=1;
            }
        }
        return count>=k;
    }
    public int findKthNumber(int m, int n, int k) {

        int low=1;
        int high=m*n;
        int res=-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(helper(m,n,k,mid)){
                res=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return res;
        
    }
}