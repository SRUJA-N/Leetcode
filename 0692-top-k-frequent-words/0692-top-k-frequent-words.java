class Solution {
    class Pair{
        String s;
        int freq;
        Pair(String s,int freq){
            this.s=s;
            this.freq=freq;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        PriorityQueue<Pair> minheap=new PriorityQueue<>(
            (a,b)->{
                if(a.freq!=b.freq){
                    return a.freq-b.freq;
                }
                return b.s.compareTo(a.s);
                }

        );
        for(String ss:words){
            map.merge(ss,1,Integer::sum);
        }
        for(String key:map.keySet()){
            minheap.add(new Pair(key,map.get(key)));
            if(minheap.size()>k){
                minheap.poll();
            }
        }
        String[] res=new String[k];
        for(int i=k-1;i>=0;i--){
            res[i]=minheap.poll().s;
        }
        return Arrays.asList(res);
    }
}