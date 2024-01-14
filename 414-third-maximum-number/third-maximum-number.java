class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        if(n==1){
            return nums[0];
        }
        if(n<3){
            return Math.max(nums[0], nums[1]);
        }

        long maxNum1 = Long.MIN_VALUE;
        for(int i=0; i<n; i++){
            maxNum1 = Math.max(nums[i], maxNum1);
        }

        long maxNum2 = Long.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(nums[i]<maxNum1 && nums[i]>maxNum2){
                maxNum2 = nums[i];
            }
        }

        long maxNum3 = Long.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(nums[i]<maxNum2 && nums[i]>maxNum3){
                maxNum3 = nums[i];
            }
        }

        return maxNum3 == Long.MIN_VALUE ? (int)maxNum1 : (int)maxNum3;
    }
}