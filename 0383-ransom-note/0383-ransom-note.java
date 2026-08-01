class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<magazine.length();i++){
            map.merge(magazine.charAt(i),1,Integer :: sum);
        }

        for(int j=0;j<ransomNote.length();j++){
            char ch=ransomNote.charAt(j);
            if (!map.containsKey(ch)) {
                return false;
            }
           if (map.containsKey(ch)) {
            int currentCount = map.get(ch);

           
            if (currentCount > 1) {
                map.put(ch, currentCount - 1);
            } 
            
            else {
                map.remove(ch);
            }
            
            
        }
        }
        return true;
    }
}