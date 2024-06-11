class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int ans[] = new int[l];

        ans[0] = 1;
        for(int i=1; i<l; i++){
            ans[i] = ans[i-1] * nums[i-1];
        }

        int right = 1;
        for(int i=l-1; i>=0; i--){
            ans[i] *= right;
            right *= nums[i];
        }

        return ans;
    }
}