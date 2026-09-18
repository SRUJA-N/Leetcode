class Solution {
    public int helper(int[] cost,int i,int n,HashMap<Integer,Integer> dp){
        if(i>=n){
            return 0; 
        }
        if(dp.containsKey(i)){
            return dp.get(i);
        }
        int a=helper(cost,i+1,n,dp);
        int b=helper(cost,i+2,n,dp);
        int min=cost[i]+Math.min(a,b);
        dp.put(i,min);

        return dp.get(i);
        
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
     HashMap<Integer,Integer> dp=new HashMap<Integer,Integer>();
        
       return Math.min(helper(cost, 0, n, dp), helper(cost, 1, n, dp));
    }
}