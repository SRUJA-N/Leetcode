class Solution {
    public int[] searchRange(int[] nums, int target) {

        if(start(nums,target)==-1){
            return new int[]{-1,-1};
        }
        return new int[]{start(nums,target),end(nums,start(nums,target),target)};
    }
    public int start(int [] nums,int target){
        int right=nums.length-1;
        int left=0;
        int st=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                st=mid;
                
                    right=mid-1;
                
            }else if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
                    
        }
        return st;
    }

         public int end(int [] nums,int left,int target){
        int right=nums.length-1;

        int st=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                st=mid;
                
                    left=mid+1;
                
             }else if(nums[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
             
                  
        }
          return st;
         }

    }
