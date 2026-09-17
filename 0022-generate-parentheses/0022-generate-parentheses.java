class Solution {
    public void helper(int n,int c1,int c2,List<String> ans,StringBuilder s){
        if(s.length()==n*2){
            ans.add(s.toString());
            return;
        }

        if(c1<n ){
            s.append('(');
            c1++;
            helper(n,c1,c2,ans,s);
            c1--;
            s.deleteCharAt(s.length()-1);

        }
        if(c2<c1){
            s.append(')');
            c2++;
            helper(n,c1,c2,ans,s);
            c2--;
            s.deleteCharAt(s.length()-1);

        }
    }
    public List<String> generateParenthesis(int n) {
        StringBuilder s=new StringBuilder();
        List<String> res=new ArrayList<>();
        helper(n,0,0,res,s);
        return res;
    }
}