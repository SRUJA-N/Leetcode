import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        int left=1;
        int right=nums.length-1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {    
            left=i+1;
            right=nums.length-1;
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            while(left<right)
            {
                int current_sum=nums[i]+nums[left]+nums[right];
                if(current_sum==0)
                {
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left<right && nums[left]==nums[left+1]){
                        left++;
                       
                    }
                    while(right>left && nums[right]==nums[right-1]){
                        right--;
                    }
                    left++;
                    right--;
                }else if(current_sum>0){
                    right--;
                }
                else{
                    left++;
                }
            }
        }

            
            
        
        return result;
        
    }
}