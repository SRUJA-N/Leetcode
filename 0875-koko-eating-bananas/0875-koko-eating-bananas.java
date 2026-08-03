class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
       int high=Integer.MIN_VALUE;
       int k=Integer.MAX_VALUE;
       for(int n:piles){
        high=Math.max(n,high);
       }
       

       while(low<=high){
        int mid=low+(high-low)/2;
         long count=0;
            int i=0;
            while(i<piles.length)
            {    
                int cur=piles[i];
            
                if(count>h){
                    break;
                }
                if(cur<=mid){
                    count++;
                }
                else{
                      count=(Math.abs(cur)/mid)+count;
                      if(cur%mid!=0){
                        count++;
                      }
                }
                i++;
                


            }
            if(count>h){
                low=mid+1;
            }else{
                k=mid;
                high=mid-1;
            }
            
           
            }
               return k;
       }
    
    }
