class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length()==0){
            return 0;

        }
        if(s.length()==1){
        return 1;
        }
        int high=0,low=0,ans=0,res=-1;
         Map<Character,Integer> map=new HashMap<>();
        while(high<s.length()){
            char ch=s.charAt(high);
            ans=ans+1;
            map.merge(ch,1,Integer :: sum);
            while(map.get(ch)>1){
                ans=ans-1;
                char ch2=s.charAt(low);
                if(map.get(ch2)>1){
                map.put(ch2,map.get(ch2)-1);
                }else{
                    map.remove(ch2);
                }
                low++;

            }
            res=Math.max(ans,res);
            high++;
        }
        return res;
        
       
        
    }
}