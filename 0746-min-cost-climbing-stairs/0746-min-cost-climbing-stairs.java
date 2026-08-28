class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int first=cost[0];
        int second=cost[1];
        int n=cost.length;
        for(i=2;i<n;i++){
            int current=cost[i]+(Math.min(first,second));
            first=second;
            second=current;
        }
        return Math.min(first,second);
    }
}