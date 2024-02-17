class Solution {
    public int findLengthOfLCIS(int[] nums) {
       return maxLength(nums,0,0,0);
    }
    private int maxLength(int[] nums,int i,int max,int count){
        if(i==nums.length)return max;
        if(i>0 && nums[i]>nums[i-1]){
            count++;
        }else{
            count=1;
        }
        max=Math.max(max,count);
      return  maxLength(nums,i+1,max,count);
    }
}