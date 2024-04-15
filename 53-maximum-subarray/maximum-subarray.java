class Solution {
    public int maxSubArray(int[] nums) {
        int currS = 0, maxS = Integer.MIN_VALUE;
        for(int n:nums){
            currS += n;
            maxS = Math.max(maxS, currS);
            if(currS<0){
                currS = 0;
            }
        }    
        return maxS;
    }
}