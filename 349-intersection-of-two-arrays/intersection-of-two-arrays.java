class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int n:nums1){
            set.add(n);
        }

        for(int n:nums2){
            if(set.contains(n)){
                ans.add(n);
                set.remove(n);
            }
        }

        int[] arr = new int[ans.size()];
        for (int i= 0; i < ans.size(); i++) arr[i] = ans.get(i);
        return arr;
    }
}