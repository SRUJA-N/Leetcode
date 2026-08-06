class Solution {
    public int scheduleCourse(int[][] courses) {
        int n=courses.length;
       
        
        Arrays.sort(courses,(a,b)-> Integer.compare(a[1],b[1]));

        int count=0;
        int cur=0;
        int i=0;

        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());

        for(int[] arr:courses){
            cur+=arr[0];
            maxheap.offer(arr[0]);
            if(cur>arr[1]){
                cur-=maxheap.poll();
            }

        }
        return maxheap.size();
       
    }
}