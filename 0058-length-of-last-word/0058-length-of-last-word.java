class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length()==1){
            return 1;
        }
            int count=0;
            char space=' ';
            int i=s.length()-1;
            while(i>=0 && s.charAt(i)==space){
                i--;

            }
            
            while(i>=0 && s.charAt(i)!=space){
                if(i<0){
                    return count;
                }
                count++;
                i--;
            }
            return count;
        
    }
}