class Solution {
    public void helper(int[] arr,int k,List<Integer> res,List<List<Integer>> ans,int target,int i,int currentsum){

        if(i==9){
            if(res.size()==k && target==currentsum){
                ans.add(new ArrayList<>(res));
            }
            return;
        }
        

        if(currentsum+arr[i]<=target){
            res.add(arr[i]);
            currentsum=currentsum+arr[i];
            helper(arr,k,res,ans,target,i+1,currentsum);
            currentsum=currentsum-res.get(res.size()-1);
            res.remove(res.size()-1);
        }
         
        helper(arr,k,res,ans,target,i+1,currentsum);

    }
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr=new int[]{1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans=new ArrayList<>();
         int cur=0;
         helper(arr,k,new ArrayList<Integer>(),ans,n,0,cur);
         return ans;
    }
}