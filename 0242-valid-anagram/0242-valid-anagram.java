class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            char d=t.charAt(i);
           map.merge(c,1,Integer::sum);
           map.merge(d,-1,Integer::sum);
        }
        for(Integer values:map.values())
        {
            if(values!=0){
                return false;
            }
        }
        return true;

    }
}