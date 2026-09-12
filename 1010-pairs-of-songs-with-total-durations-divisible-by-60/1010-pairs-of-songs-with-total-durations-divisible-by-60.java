class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int res=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int t:time){
            int rem=t%60;
            int target=60-rem;
            if(map.containsKey(target)){
             res=res+map.get(target);
            }
            if(rem!=0){
                map.merge(rem,1,Integer::sum);
            }else{
                map.merge(60,1,Integer::sum);
            }

        }
        return res;
    }
}