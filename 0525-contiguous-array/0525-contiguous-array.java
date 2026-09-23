class Solution {
    public int findMaxLength(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int maxlength=0;
       int current=0;
       map.put(0,-1);
       for(int i=0;i<nums.length;i++)
       {
            current+= (nums[i]==1) ? 1 : -1;
            if(map.containsKey(current))
            {
                maxlength=Math.max(maxlength,i-map.get(current));
            }
            else
            {
                map.put(current,i);
            }
       }
       return maxlength;
    }
}