class Solution {
    public int trap(int[] height) {
       int left=0;
       int right=height.length-1;
       int LM=0;
       int RM=0;
       int count=0;
       while(left<right)
       {
            LM=Math.max(LM,height[left]);
            RM=Math.max(RM,height[right]);

            if(LM<RM){
                count+=(LM-height[left]);
                left++;
            }else{
                count+=(RM-height[right                ]);
                right--;
            }
       }
       return count;
    }
}
