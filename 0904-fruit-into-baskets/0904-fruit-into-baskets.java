class Solution {
    public int totalFruit(int[] a) {
            int res=-1,sum=0,high=0,low=0;
            Map<Integer,Integer> map=new HashMap<>();
            while(high<a.length){
                sum+=1;
                map.merge(a[high],1,Integer :: sum);
                while(map.size()>2)
                {   sum-=1;
                    if(map.containsKey(a[low]))
                    {
                        if(map.get(a[low])==1){
                             map.remove(a[low]);
                          
                        }else{
                             map.put(a[low],map.get(a[low])-1);
                        }
                        
                    }
                    low++;
                }
              
                        res=Math.max(res,sum);
                    
                    high++;
      
                
            }
            return res;
    }
}