class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int lp=0, rp=n-1;
        int maxWater = 0;
        while(lp<rp){
            int ht=Math.min(height[lp], height[rp]);
            int wid=rp-lp;
            int currWater = ht*wid;
            maxWater = Math.max(currWater, maxWater);

            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }
        }

        return maxWater;
    }
}