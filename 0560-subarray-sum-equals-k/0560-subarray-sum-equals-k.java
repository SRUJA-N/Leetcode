class Solution {
    
    public int subarraySum(int[] nums, int k) {
        int sum=0,count=0;
       HashMap<Integer,Integer> map=new HashMap<>();
       map.put(0,1);
       for(int num:nums)
       {
         sum=sum+num;
         if(map.containsKey(sum-k)){
            count+=map.get(sum-k);
         }
         map.merge(sum,1,Integer::sum);
       }
       return count;

    }
}