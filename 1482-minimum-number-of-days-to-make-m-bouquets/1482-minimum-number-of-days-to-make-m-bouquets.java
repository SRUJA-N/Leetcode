class Solution {

    public Boolean find(int[] nums,int days,int m,int k){
         int streak=0, counter=0;
         for(int i=0;i<nums.length;i++){
            if(nums[i]<=days){
                streak++;
            }else if(nums[i]>days){
                streak=0;
            }
            if(streak==k){
                streak=0;
                counter++;
            }
         }
         return counter>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) {
    return -1;
}
        int left=0;
        int right=0;
        int min=bloomDay[0];
        int max=bloomDay[0];
        int res=0;
        for(int n:bloomDay){
            if(n>max){
max=n;
            }
            if(n<min){
                min=n;
            }
        }
        left=min;
        right=max;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(find(bloomDay,mid,m,k)){
                res=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }


        }
        if(left==right) return -1;
        return res;
    }
}