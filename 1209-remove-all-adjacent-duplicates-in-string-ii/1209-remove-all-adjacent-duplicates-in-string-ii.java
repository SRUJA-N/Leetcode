class Solution {
    public class Pair{
        char ch;
        int count;
        Pair(char ch,int count){
            this.ch=ch;
            this.count=count;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Pair> stack=new Stack();
        int ind=0;
        
        for(int i=0;i<s.length();i++)
        {
            if(!stack.isEmpty() && stack.peek().ch == s.charAt(i) ){
                stack.peek().count++;
            }else{
                stack.push(new Pair(s.charAt(i),1));
            }

            if(!stack.isEmpty() && stack.peek().count==k){
                stack.pop();
            }



        }

        StringBuilder res=new StringBuilder();

        for(Pair p : stack){
            for(int i=0;i<p.count;i++){
                res.append(p.ch);
            }
        }

        return res.toString();



    }
}