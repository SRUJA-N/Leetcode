import java.util.*;
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
         if (intervals.length == 0) {
            return new int[][]{newInterval};
        }
        int low=0;
        int high=intervals.length-1;
        int inx=intervals.length;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(intervals[mid][0]>newInterval[0]){
               inx=mid;
               high=mid-1;
            }else{
                low=mid+1;
            }

        }
 int[][] combined=new int[intervals.length+1][2];
        for(int i=0;i<inx;i++){
             combined[i][0]=intervals[i][0];
              combined[i][1]=intervals[i][1];
        }
        combined[inx][0]=newInterval[0];
        combined[inx][1]=newInterval[1];
        for(int i=inx;i<intervals.length;i++){
            combined[i+1][0]=intervals[i][0];
            combined[i+1][1]=intervals[i][1];
        }
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