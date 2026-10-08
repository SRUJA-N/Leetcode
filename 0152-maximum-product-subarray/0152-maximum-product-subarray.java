class Solution {
    public int maxProduct(int[] nums) {
        int cur=1;
        int mincur=1;
        int res=Integer.MIN_VALUE;
        int minsofar=Integer.MAX_VALUE;
        for(int num:nums)
        {
            cur=cur*num;
            mincur=mincur*num;
            
            int min=mincur;
            mincur=Math.min(num,Math.min(mincur,cur));
            cur=Math.max(num,Math.max(cur,min));
            res=Math.max(res,Math.max(mincur,cur));
        }
        return res;
    }
}