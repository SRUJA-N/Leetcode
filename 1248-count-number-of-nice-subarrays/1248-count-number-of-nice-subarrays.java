class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
       
       map.put(0,1);
       
      int count = 0 ;
      
       int sum=0;

       for(int i=0;i<nums.length;i++)
       {
            sum+=nums[i]%2;

            if(map.containsKey(sum-k)){
                count+=map.get(sum-k);

            }
           
            map.merge(sum,1,Integer :: sum);
       }

       return count;
    }
}