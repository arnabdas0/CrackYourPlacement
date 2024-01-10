class Solution {
    public int findGCD(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int e:nums){
            max = Math.max(max, e);
            min = Math.min(min, e);
        }

        return gcd(min, max);
    }

    public int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a, a);
    }
}