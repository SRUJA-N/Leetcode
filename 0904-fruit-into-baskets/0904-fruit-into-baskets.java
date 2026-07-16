class Solution {
    public int totalFruit(int[] fruits) {

        if(fruits.length == 1){
            return 1;
        }
        int low=0;
        int high=0;
        Map<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int res=-1;
        while(high<fruits.length){
            map.merge(fruits[high],1,Integer :: sum);
            sum+=1;
            while(map.size()>2){
                if(map.containsKey(fruits[low])){
                    if(map.get(fruits[low])>1){
                        sum=sum-1;
                        map.put(fruits[low],map.get((fruits[low]))-1);
                    }else{
                         sum=sum-1;
                        map.remove(fruits[low]);
                    }

                    low++;
                }
            }
            high++;
           
                res=Math.max(res,sum);
           
        }
        return res;
        
    }
}