import java.util.*;

class Solution { 
    public class Pair { 
        int freq; 
        char ch; 
        Pair(char ch, int freq) { 
            this.ch = ch; 
            this.freq = freq; 
        } 
    } 

    public int leastInterval(char[] tasks, int n) { 
        HashMap<Character, Integer> map = new HashMap<>(); 
        PriorityQueue<Pair> maxheap = new PriorityQueue<>( (a, b) -> b.freq - a.freq ); 
        HashMap<Character, Integer> constraint = new HashMap<>(); 
        
        for (int i = 0; i < tasks.length; i++) { 
            map.merge(tasks[i], 1, Integer::sum); 
            constraint.put(tasks[i], 1); 
        } 
        
        for (char ch : map.keySet()) { 
            maxheap.offer(new Pair(ch, map.get(ch))); 
        } 
        
        int seat = 1; 
        while (!maxheap.isEmpty()) { 
           
            List<Pair> grouped = new ArrayList<>(); 
            boolean taskExecuted = false;

            while (!maxheap.isEmpty()) { 
                Pair cur = maxheap.poll(); 
                char ch = cur.ch; 
                int freq = cur.freq; 
                
                if (constraint.get(ch) <= seat) { 
                    if (freq > 1) { 
                        cur.freq = freq - 1; 
                        maxheap.offer(cur); 
                    } 
                    constraint.put(ch, seat + n + 1); 
                    taskExecuted = true;
                    break; 
                } else { 
                    grouped.add(cur); 
                } 
            } 
            
       
            for (Pair p : grouped) { 
                maxheap.offer(p); 
            } 
            
        
            seat++; 
        } 
        return seat - 1; 
    } 
}
