class data{
    int num;
    int index;
    data(int num,int index){
        this.num=num;
        this.index=index;
    }
}
class Solution {

    public int[] dailyTemperatures(int[] temperatures) {
        int[] res=new int[temperatures.length];
        int n=temperatures.length;
        Stack<data> stack=new Stack<>();
        for(int i=temperatures.length-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek().num<=temperatures[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                res[i]=0;
                
            }else{
                res[i]=stack.peek().index-i;
            }
            stack.push(new data(temperatures[i],i));

        }
        return res;
    }
}