class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        boolean prime[] = new boolean[n+1];
        Arrays.fill(prime, true);

        for(int p=2; p*p<=n; p++){
            if(prime[p]==true){
                for(int i=p*p; i<=n; i+=p){
                    prime[i]=false;
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(int i=2; i<n/2+1; i++){
            if(prime[i] && prime[n-i]){
                ans.add(Arrays.asList(i, n-i));
            }
        }
        return ans;
    }
}