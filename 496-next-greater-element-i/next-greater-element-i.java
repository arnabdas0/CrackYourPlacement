class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int [nums1.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> s = new Stack<>();

        for(int n:nums2){
            while(!s.isEmpty() && n>s.peek()){
                map.put(s.pop(), n);
            }

            s.add(n);
        }

        int i=0;
        for(int n:nums1){
            ans[i++] = map.getOrDefault(n, -1);
        }

        return ans;
    }
}