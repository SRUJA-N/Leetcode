class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n==0|| (n==0&&m==0)){
            return true;
        }
        if( m==0 ){
            return false;
        }
        char ch='l';
        int left=0;
        int right=0;
        while(right<m){
            if(left<n){
            ch=s.charAt(left);
            }
             char ch2=t.charAt(right);
            if(ch!=ch2){
                right++;
            }else if(ch==ch2){
                left++;
                right++;
            }
        }
        if(left!=n){
            return false;
        }
        return true;
    }
}