class Solution {
    HashMap<Integer,Integer> dp=new HashMap<>();
    public int helper(int i,int n)
    {
        if(i==n){
            return 1;
        }
        if(i>n){
            return 0;
        }
        if(dp.containsKey(i)){
            return dp.get(i);
        }
        int a=helper(i+1,n);
        int b=helper(i+2,n);
        
        int ans=a+b;
        dp.put(i,ans);
        return ans;
    }
    public int climbStairs(int n) {
        return helper(0,n);
    }
}