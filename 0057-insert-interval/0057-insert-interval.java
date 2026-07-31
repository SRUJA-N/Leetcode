import java.util.*;
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
         if (intervals.length == 0) {
            return new int[][]{newInterval};
        }

        int[][] combined=new int[intervals.length+1][2];
        System.arraycopy(intervals,0,combined,0,intervals.length);

        combined[intervals.length][0]=newInterval[0];
        combined[intervals.length][1]=newInterval[1];
        Arrays.sort(combined,(a,b)-> Integer.compare(a[0],b[0]));
        int start1=combined[0][0];
        int end1=combined[0][1];
        int start2;
        int end2;
        List<int[]> res=new ArrayList<>();

        for(int i=1;i<combined.length;i++){
            start2=combined[i][0];
            end2=combined[i][1];

            if(end1>=start2){
                end1=Math.max(end1,end2);
                continue;
            }
            res.add(new int[]{start1,end1});
            start1=start2;
            end1=end2;
        }
         res.add(new int[]{start1,end1});

         return res.toArray(new int[res.size()][]);


        
    }
}