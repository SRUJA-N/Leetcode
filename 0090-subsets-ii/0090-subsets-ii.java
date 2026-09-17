class Solution {
    public void helper(int[] num,int i,int n,List<Integer> res,List<List<Integer>> ans){
        if(i==n){
            ans.add(new ArrayList<Integer>(res));
            return;
        }

 

        res.add(num[i]);
        
       helper(num,i+1,n,res,ans);
    
        res.remove(res.size()-1);

        while(i+1<n && num[i]==num[i+1]){
            i++;
        }
            helper(num,i+1,n,res,ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
    Arrays.sort(nums);
        helper(nums,0,nums.length,new ArrayList<Integer>(),ans);
        return ans;
    }
}