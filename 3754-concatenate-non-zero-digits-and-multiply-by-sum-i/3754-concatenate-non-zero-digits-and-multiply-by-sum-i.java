class Solution {
    public long sumAndMultiply(int n) {
        String num=Integer.toString(n);
        long mul=-1;
        long sum=0;
        for(int i=0;i<num.length();i++){
            int digit=num.charAt(i)-'0';
            if(digit!=0){
                if(mul!=-1){
                    mul=mul*10+digit;
                }else{
                    mul=digit;
                }


                sum=sum+digit;

            }
        }
        return sum*mul;


    }
}