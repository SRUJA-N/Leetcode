class Solution {
    public class Pair{
        int num;
        int freq;
        Pair(int n,int f){
            this.num=n;
            this.freq=f;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> minheap=new PriorityQueue<>(
            (a,b)->a.freq-b.freq
            
        );
        HashMap<Integer,Integer>  map=new HashMap<>();
        for(int n:nums){
            map.merge(n,1,Integer::sum);
        }
        
        for(int key:map.keySet()){
            minheap.add(new Pair(key,map.get(key)));
            if(minheap.size()>k){
                minheap.poll();
            }
        }
        int[] res= new int[k];
        for(int i=0;i<k;i++){
            res[i]=minheap.poll().num;
        }
        return res;

    }
}