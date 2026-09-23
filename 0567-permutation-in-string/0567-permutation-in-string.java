class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        int f1=s1.length();
        int f2=s2.length();
        if(f1>f2){
            return false;
        }
        int[] first=new int[26];
        int[] second = new int[26];

        for(int i=0;i<f1;i++){
            first[s1.charAt(i)-'a']++;
            second[s2.charAt(i)-'a']++;
        }
       if(Arrays.equals(first,second)) return true;

       for(int i=f1;i<f2;i++){
        second[s2.charAt(i)-'a']++;
        second[s2.charAt(i-f1)-'a']--;
        if(Arrays.equals(first,second)) return true;

       }
       return false;
    }
}