class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer>  map=new HashMap<>();
        map.put(0,1);
        int oddcount=0;
        int count=0;
        for(int num:nums){
            oddcount+=num%2;
            if(map.containsKey(oddcount-k)){
                count+=map.get(oddcount-k);
            }

           map.merge(oddcount,1,Integer::sum);
        }
        return count;
    }
}