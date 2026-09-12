class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0;
        int totalcost=0;
        int index=0;
        int current=0;
        for(int i=0;i<gas.length;i++)
        {
            totalgas+=gas[i];
            totalcost+=cost[i];
        }

        if(totalgas<totalcost){
            return -1;
        }

        for(int i=0;i<gas.length;i++){
             current=current+gas[i]-cost[i];

            if(current<0){
                index=i+1;
                current=0;

            }
        }
        return index;

    }
}