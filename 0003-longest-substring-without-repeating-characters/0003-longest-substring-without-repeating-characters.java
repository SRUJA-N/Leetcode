class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==1) return 1;
        if(s.length()==0) return 0;
        Map<Character,Integer>  map= new HashMap<>();
        int high=0,low=0,res=-1;
        while(high<s.length())
        {   
            char ch=s.charAt(high);
            map.merge(ch,1,Integer :: sum);
            while(map.get(ch)>1){
                char ch2=s.charAt(low);
                
                        map.put(ch2,map.get(ch2)-1);

                    
                         low++;
                
                }
              
            
              res=Math.max(res,high-low+1);
             high++;
        }
        return res;
       
        
    }
}