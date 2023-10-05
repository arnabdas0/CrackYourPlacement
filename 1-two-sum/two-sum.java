class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int j=0; j<nums.length; j++){
            int i = target - nums[j];
            if(map.containsKey(i)){
                return new int[]{map.get(i), j};
            }
            map.put(nums[j], j);
        }

        return new int[]{};
    }
}