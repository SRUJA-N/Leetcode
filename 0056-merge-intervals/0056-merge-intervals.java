class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <=1){
            return intervals;
        }
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        
        int start1=intervals[0][0];
        int end1=intervals[0][1];
        List<int[]> res = new ArrayList<>();
        int end2;
        int start2;
        for(int i=1;i<intervals.length;i++)
        {
            start2=intervals[i][0];
            end2=intervals[i][1];
            if(end1>=start2){
                
                end1=Math.max(end1,end2);
                continue;
            }
            res.add(new int[]{start1,end1});
            start1=start2;
            end1=end2;
        }
       res.add(new int[]{start1,end1});
        return res.toArray(new int[res.size()][2]);
    }
}