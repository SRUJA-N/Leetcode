class Solution {
    public void helper(int[] nums,int i,int n,List<Integer> res,List<List<Integer>> ans)
    {
        if(i>=n){
            ans.add(new ArrayList<>(res));
            return;
        }
        helper(nums,i+1,n,res,ans);
        
        res.add(nums[i]);
        helper(nums,i+1,n,res,ans);
        res.remove(res.size()-1);
    

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        helper(nums,0,nums.length,new ArrayList<Integer>(),res);
        return res;
    }
}