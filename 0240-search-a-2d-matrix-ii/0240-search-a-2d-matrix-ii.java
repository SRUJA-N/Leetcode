class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length-1;
        int cols=0;
        while(row>=0 && cols<matrix[0].length){
            if(matrix[row][cols]==target){
                return true;
            }else if(matrix[row][cols]>target){
                row=row-1;
            }else{
                cols=cols+1;
            }
        }
        return false;
    }
}