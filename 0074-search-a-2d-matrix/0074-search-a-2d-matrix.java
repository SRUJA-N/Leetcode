class Solution {
    
    public boolean searchMatrix(int[][] matrix, int target) {
           int idx=0;
        int l=0;
        int r=matrix.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if (matrix[m][0] == target) return true;
            if(matrix[m][0]<target){
                
                l=m+1;
            }else{
                r=m-1;
            }
        }
        if(r<0){
            return false;
        }
        idx=r;
  
        if(matrix[idx][0]>target && target > matrix[idx][matrix[idx].length-1]){
                return false;
            }
        int low=0;
        int high=matrix[0].length-1;
        while(low<=high){
             int mid=low+(high-low)/2;
            if(matrix[idx][mid]==target) {return true;}
            else if(matrix[idx][mid]>target){
                high=mid-1;
                
            }else{
                low=mid+1;
            }


        }
        return false;
       

    }
}