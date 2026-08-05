class Solution {
    public class Pair{
        char ch;
        int freq;
        Pair(char ch,int freq){
            this.ch=ch;
            this.freq=freq;
        }
    }

    public String reorganizeString(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
           

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.merge(ch,1,Integer::sum);

        }

        PriorityQueue<Pair> maxheap=new PriorityQueue<>(
             (a,b)->{
                if(a.freq!=b.freq){
                return b.freq-a.freq;
            }
            return Character.compare(a.ch,b.ch);
             }
        );
        for(char c:map.keySet()){
            maxheap.offer(new Pair(c,map.get(c)));
        }
        StringBuilder res=new StringBuilder();
        
        while(maxheap.size()>=2)
        {
            Pair first=maxheap.poll();
            Pair second=maxheap.poll();
            res.append(first.ch);
            res.append(second.ch);
            first.freq--;
            second.freq--;
            if(first.freq>0){
                maxheap.offer(first);
            }
            if(second.freq>0){
                maxheap.offer(second);
            }



        }
     while(!(maxheap.isEmpty())){
        Pair cur=maxheap.poll();

        if(cur.freq>1){
            return "";
        }
        res.append(cur.ch);
     }
     return res.toString();



        


    }
}