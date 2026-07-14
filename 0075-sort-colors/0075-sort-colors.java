class Solution {
    public void sortColors(int[] nums) {
        int r=0,w=0,b=0;
        for(int c:nums){
            if(c==0)
            {
                r++;
            }else if(
                c==1
            ){
                w++;
            }else{
                b++;
            }
        }
        for(int i=0;i<r;i++){
            nums[i]=0;
            
        }
        for(int i=r;i<w+r;i++){
            nums[i]=1;
            
        }
        for(int i=r+w;i<r+w+b;i++){
            nums[i]=2;
            
        }
       

        


        
    }
}