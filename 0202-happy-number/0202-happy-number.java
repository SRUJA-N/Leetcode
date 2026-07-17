class Solution {
    public boolean isHappy(int n) {

       int slow=n;
       int fast=n;
       while(fast !=1 ){
        slow=sum_of_each_digits_square(slow);
        fast=sum_of_each_digits_square(fast);
        fast=sum_of_each_digits_square(fast);

        if(fast==slow && slow!=1 ){
            return false;
        }
       }
       return true;


        
    }
    public int sum_of_each_digits_square(int n){
        int d;
        int sum=0;
        while(n>0){
            d=n%10;
            n=n/10;
            sum=sum+(d*d);
        }
        return sum;
    }
}