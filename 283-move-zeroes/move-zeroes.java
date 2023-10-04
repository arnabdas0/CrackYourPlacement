class Solution {
    public void moveZeroes(int[] nums) {
        int insertIdx = 0;
        for(int num:nums){
            if(num != 0){
                nums[insertIdx] = num;
                insertIdx++;
            }
        }

        while(insertIdx < nums.length){
            nums[insertIdx] = 0;
            insertIdx++;
        }
    }
}