class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
        int temp=image[sr][sc];
        if(temp == color) return image;
        dfs(image,sr,sc,color,temp);
        return image;


    }
    public void dfs(int[][] arr,int i,int j,int color,int temp){
        if(i<0 || j>=arr[0].length || i>=arr.length || j<0|| arr[i][j]!=temp){
            return ;
        }
        
            arr[i][j]=color;
           
        dfs(arr,i+1,j,color,temp);
         dfs(arr,i-1,j,color,temp);
          dfs(arr,i,j+1,color,temp);
           dfs(arr,i,j-1,color,temp);

           


    }
}