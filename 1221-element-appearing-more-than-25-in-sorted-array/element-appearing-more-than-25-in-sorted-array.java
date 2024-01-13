class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int parts = n/4, count = 1, a = arr[0];
        for(int i=1; i<n; i++){
            if (arr[i]==a) {
                count++;
            } else{
                count = 1;
            }
            if(count>parts){
                return arr[i];
            }
            a = arr[i];
        }
        return a;
    }
}