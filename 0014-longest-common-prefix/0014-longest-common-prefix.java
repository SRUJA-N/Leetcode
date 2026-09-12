class Solution {
    public String longestCommonPrefix(String[] strs) {
        int i=0,j=0,index=0;
        Arrays.sort(strs);

        String s1=strs[0];
        String s2=strs[strs.length-1];

        while(i < s1.length() && j < s2.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                index++;
            }else{
                break;
            }
            i++;
            j++;
        }
        return s1.substring(0,index);
    }
}