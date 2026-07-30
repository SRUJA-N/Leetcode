class Solution {
    public int findMaxLength(int[] nums) {
        int ans=0;
        int diff;
        int one=0;
        int zero=0;
        int res=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0){
                zero++;
            }else{
                one++;
            }
            diff=one-zero;
            if(diff==0){
                res=Math.max(res,i+1);
                continue;
            }

            if(!(map.containsKey(diff))){
                map.put(diff,i+1);

            }else{
               
                res=Math.max(res,((i+1)-map.get(diff)));
            }
        }
        return res;
    }
}