class Solution {
 
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n=profits.length;
        int[][] sorted=new int[n][2];
        for(int i=0;i<n;i++)
        {
            sorted[i][0]=capital[i];
            sorted[i][1]=profits[i];

        }
        Arrays.sort(sorted,(a,b)->Integer.compare(a[0],b[0]));
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        while(k > 0){
            while(i<n && sorted[i][0]<=w){
                maxheap.offer(sorted[i][1]);
                i++;
            }
            if(maxheap.isEmpty()){
                break;
            }
            w+=maxheap.poll();
            k=k-1;
        }
        return w;
    }
}