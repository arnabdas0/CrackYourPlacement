class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumCost=0;
        for(int i=0;i<cost.length;i++){
            sumCost+=cost[i];
        }
        int sumGas=0;
        for(int i=0;i<gas.length;i++){
            sumGas+=gas[i];
        }
        if(sumCost>sumGas)
            return -1;
        int curr=0,startingIndex=0;
        for(int i=0;i<gas.length;i+=1){
            curr+=gas[i]-cost[i];
            if(curr<0){
                curr=0;
                startingIndex=i+1;
            }
        }
        return startingIndex;
    }
}