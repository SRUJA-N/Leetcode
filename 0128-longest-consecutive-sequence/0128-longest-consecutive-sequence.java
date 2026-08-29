class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int res=0;
        for(int n:nums){
            set.add(n);
        }

        for(int n:set){
            if(!set.contains(n-1)){
                int currentcount=1;
                while(set.contains(n+1)){
                    currentcount++;
                    n++;
                }
                res=Math.max(currentcount,res);
            }
        }
        return res;
    }
}