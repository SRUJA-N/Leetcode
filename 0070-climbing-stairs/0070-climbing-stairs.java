class Solution {
    public int helper(int n,HashMap<Integer,Integer> dp,int i){
        if(i>n){
            return 0;

        }
        if(i==n){
            return 1;
        }
        if(dp.containsKey(i)){
            return dp.get(i);
        }
        int a=helper(n,dp,i+1);
        int b=helper(n,dp,i+2);
        dp.put(i,a+b);

        return dp.get(i);
    }
    public int climbStairs(int n) {
       return helper(n,new HashMap<Integer,Integer>(),0);
    }
}