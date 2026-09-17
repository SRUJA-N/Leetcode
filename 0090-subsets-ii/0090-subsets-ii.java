class Solution {
    public void helper(int[] num,int i,int n,List<Integer> res,List<List<Integer>> ans){
        if(i==n){
            if(!ans.contains(res)){
            ans.add(new ArrayList<Integer>(res));
            }
            return;
        }



        helper(num,i+1,n,res,ans);

        res.add(num[i]);
        
        
        helper(num,i+1,n,res,ans);
        res.remove(res.size()-1);

      
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        helper(nums,0,nums.length,new ArrayList<Integer>(),ans);
        return ans;
    }
}