class Solution {
    public int lengthOfLongestSubstring(String s) {
          if(s.length()==0)return 0;
       HashMap<Character,Integer> map=new HashMap<>();
       if(s.length()==1)return 1;
       int left=0;
       int right=1;
       map.put(s.charAt(0),1);
       int res=0;
       while(right<s.length()){
        char ch=s.charAt(right);
        if(!(map.containsKey(ch))){
            map.put(ch,1);
            right++;
        }else{
            map.remove(s.charAt(left));
            
            
            left++;
        }
        res=Math.max(res,right-left);
        
       }
       return res;
       
        
    }
}