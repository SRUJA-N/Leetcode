class Solution {
    public int threeSumClosest(int[] nums, int target) {
        

        int left;
        int right=nums.length-1;
        int closest=nums[0]+nums[1]+nums[2];
        int current_sum=0;
        Arrays.sort(nums);

        for(int pivot=0;pivot<nums.length-2;pivot++)
        {   
           
            left=pivot+1;
            right=nums.length-1;

            while(left<right)
            {
                current_sum=nums[pivot]+nums[left]+nums[right];
                if(current_sum==target) 
                {
                    return current_sum;
                }

                if(Math.abs(closest-target)>Math.abs(current_sum-target)){
                    closest=current_sum;

                }

                if(current_sum>target){
                    right--;
                }else{
                    left++;
                }

                
                
            }

            
        }
        return closest;
    }
}