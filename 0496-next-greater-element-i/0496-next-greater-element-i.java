class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> s=new Stack<>();
        int[] res=new int[nums1.length];
        int index=0;
        for(int i=nums2.length-1;i>=0;i--){

           int element=nums2[i];

           
           

           while(!s.isEmpty() && s.peek()<=element){
            s.pop();
           }
           if(s.isEmpty()){
            map.put(element,-1);
           }else{
            map.put(element,s.peek());
           }
           
           s.push(element);


        }
        for(int i = 0; i < nums1.length; i++) {
         res[i] = map.get(nums1[i]);
         }

        return res;
    }
    
}