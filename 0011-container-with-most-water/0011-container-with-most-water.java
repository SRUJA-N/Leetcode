class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int result=0;
        while(left<right)
        {
            int h=Math.min(height[left],height[right]);
            int curr=(right-left)*(h);
            result=Math.max(result,curr);
            if(height[left]<height[right])
            {
                left++;
            }else{
                right--;
            }

        }
        return result;
    }
}                                                                                                                                                                                                                                   