class Solution {
    public boolean isHappy(int n) {
             int slow=n;
             int fast=n;
           
             while(fast!=1){
               slow=sum_of_digits_square(slow);
               if(slow==1){
                return true;
               }
                fast=sum_of_digits_square(fast);
                 fast=sum_of_digits_square(fast);
                if(fast==slow){
                    return false;
                }

            
             }
return true;
             
      
        
    }

    public int sum_of_digits_square(int n){
        int d;
        int square_sum=0;
        while(n>0){
            d=n%10;
            n=n/10;
            square_sum+=(d*d);
        }
        return square_sum;

    }
   
    
}