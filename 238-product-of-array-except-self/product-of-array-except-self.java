class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int ans[] = new int[l];

        Arrays.fill(ans, 1);
        for(int i=1; i<l; i++){
            ans[i] = ans[i-1] * nums[i-1];
        }

        int right = nums[l-1];
        for(int i=l-2; i>=0; i--){
            ans[i] *= right;
            right *= nums[i];
        }

        return ans;
    }
}