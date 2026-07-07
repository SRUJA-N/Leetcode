class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Set<Integer> set=new HashSet<>();

        HashMap<Integer,Integer>  map=new HashMap<>();

        for(int i=0;i<=nums.length-1;i++)
        {
            if(set.add(nums[i])){
            map.put(nums[i],i);
            }else{
                int j=map.get(nums[i]);
                    if(i-j<=k){
                        return true;
                    }

                    map.put(nums[i],i);


            }


        }
        return false;
        
        
    }
}