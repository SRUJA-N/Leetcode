class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int left=0;
        int right=0;
        int fLength=firstList.length;
        int sLength=secondList.length;
        int start;
        int end;
        List<int[]> res=new ArrayList<>();

        while(left<fLength && right < sLength)
        {   
            int A[]=firstList[left];
            int B[]=secondList[right];
            start=Math.max(A[0],B[0]);
            end=Math.min(A[1],B[1]);
            if(start<=end){
            res.add(new int[]{start,end});
            }
            if(A[1]<B[1]){
                left=left+1;
            }else{
                right=right+1;
            }


        }
        return res.toArray(new int[res.size()][]);
    }
}