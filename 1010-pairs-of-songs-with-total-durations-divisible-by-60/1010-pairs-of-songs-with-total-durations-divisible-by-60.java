class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int res=0;
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int num:time){
        int reminder=num%60;
        int target=(60-reminder)%60;
        if(map.containsKey(target)){
            res=res+map.get(target);
        }
        
        map.merge(reminder,1,Integer::sum);
        
       }
       return res;
    }
}