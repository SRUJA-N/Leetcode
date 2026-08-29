class Solution {
   class Pair{
    int number;
    int frequency;
    Pair(int number,int frequency){
        this.number=number;
        this.frequency=frequency;
    }
   }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<Pair> minheap=new PriorityQueue<>((a,b)->Integer.compare(a.frequency,b.frequency) );
       
        for(int num:nums){
            map.merge(num,1,Integer::sum);
        }
         for(int key:map.keySet()){
            minheap.add(new Pair(key,map.get(key)));
            if(minheap.size()>k){
                minheap.poll();
            }
         }
         int[] res=new int[k];
         for(int i=0;i<k;i++){
            res[i]=minheap.poll().number;
         }
         return res;
    }
}