class Solution {
    public int[] twoSum(int[] nums, int target) {
      HashMap<Integer,Integer> map=new HashMap<>();

      int com=0;

      for(int i=0;i<nums.length;i++){
        com=target-nums[i];
        if(!map.containsKey(com)){
            map.put(nums[i],i);
        }else{
            return new int[] {map.get(com),i};
        }
      }
      return new int[] {-1,-1};
      
}
}