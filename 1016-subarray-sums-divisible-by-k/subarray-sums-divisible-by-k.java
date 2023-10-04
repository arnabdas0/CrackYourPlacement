class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int map[] = new int[k];
        int rem=0;
        int count=0;
        map[0] = 1;
        for(int n:nums){
            rem = (rem+n)%k;
            if(rem<0){
                rem += k;
            }
            map[rem]++;
        }

        for(int m:map){
            count += m*(m-1)/2;
        }

        return count;
    }
}