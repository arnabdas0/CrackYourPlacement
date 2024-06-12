class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tGas = 0, tCost = 0, ans =0, tank = 0;
        for(int i=0; i<gas.length; i++){
            tGas += gas[i];
            tCost += cost[i];
        }

        if(tGas<tCost){
            return -1;
        }

        for(int i=0; i<gas.length; i++){
            tank += gas[i] - cost[i];
            if(tank<0){
                tank = 0;
                ans = i+1;
            }
        }
        return ans;
    }
}