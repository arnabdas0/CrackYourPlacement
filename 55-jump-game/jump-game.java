class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int lastIdx = n-1;
        for(int i=n-1; i>=0; i--){
            if(i+nums[i]>=lastIdx){
                lastIdx = i;
            }
        }

        return lastIdx == 0;
    }
}