class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean[] seen = new boolean[1001];
        List<Integer> array = new ArrayList<>();
        for(int num : nums1){
            seen[num] = true;
        }
        for(int num : nums2){
            if(seen[num]){
                array.add(num);
                seen[num] = false;
            }
        }
        int[] arr = new int[array.size()];
        for(int i = 0;i < array.size(); i++){
            arr[i] = array.get(i);
        }
        return arr;
    }
}