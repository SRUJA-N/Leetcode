class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        List<int[]> res=new ArrayList<>();

        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int s1,s2,e1,e2;
        s1=intervals[0][0];
        e1=intervals[0][1];

        for(int i=1;i<intervals.length;i++){
        s2=intervals[i][0];
        e2=intervals[i][1];
        if(e1>=s2){
            e1=Math.max(e1,e2);
            continue;
        }
        res.add(new int[]{s1,e1});
        s1=s2;
        e1=e2;
        }

        res.add(new int[]{s1,e1});

        return res.toArray(new int[res.size()-1][2]);

    }
}