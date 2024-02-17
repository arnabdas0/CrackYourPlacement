class Solution {
    public int findLengthOfLCIS(int[] nums){
	    int maximum = 1;
	    int currentMax = 1;
	    for(int i = 1; i < nums.length; i++){
		    currentMax = nums[i] > nums[i - 1] ? currentMax + 1 : 1;   
		    maximum = Math.max(maximum, currentMax);
	    }

	    return nums.length == 0 ? 0 : maximum;
    }
}