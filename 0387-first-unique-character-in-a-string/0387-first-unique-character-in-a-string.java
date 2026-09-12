class Solution {
    public int firstUniqChar(String s) {
       HashMap<Character,Boolean> map=new HashMap<>();
       char ch;
       for(int i=0;i<s.length();i++){
        ch=s.charAt(i);
        if(!map.containsKey(ch)){
            map.put(ch,true);
        }else{
            map.put(ch,false);
        }
       }

       for(int i=0;i<s.length();i++){
        ch=s.charAt(i);
        if(map.get(ch)==true){
            return i;
        }
       }
       return -1;
    }
}