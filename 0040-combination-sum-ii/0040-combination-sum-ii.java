class Solution {

    public void helper(int[] nums,int i,int n,int currentsum,List<Integer> res,List<List<Integer>> ans,int target){
        if(i==n){
            if(currentsum==target){
            ans.add(new ArrayList<>(res));
            }

            return;

        }
       
        if(currentsum+nums[i]<=target){
            
            res.add(nums[i]);
            currentsum=currentsum+nums[i];
            helper(nums,i+1,n,currentsum,res,ans,target);
            currentsum=currentsum-res.get(res.size()-1);
            res.remove(res.size()-1);
            

        }
        while(i+1<n && nums[i]==nums[i+1]){
                i++;
            }
             helper(nums,i+1,n,currentsum,res,ans,target);

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<List<Integer>> ans=new ArrayList<>();
       int c=0;
       Arrays.sort(candidates);
       helper(candidates,0,candidates.length,c,new ArrayList<Integer>(),ans,target);
       return ans;
    }
}