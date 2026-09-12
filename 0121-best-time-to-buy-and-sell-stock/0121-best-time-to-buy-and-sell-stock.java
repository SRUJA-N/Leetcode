class Solution {
    public int maxProfit(int[] prices) {
     int mincur=prices[0];
     int res=0;
     for(int i=1;i<prices.length;i++){
        mincur=Math.min(mincur,prices[i]);
        res=Math.max(res,prices[i]-mincur);
     }
     return res;
    

}
}