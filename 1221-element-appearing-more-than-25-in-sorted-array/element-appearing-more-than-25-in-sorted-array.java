class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap();
        for(int i = 0 ; i < arr.length ; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int ans = 0;
        int ansk = 0;
        for(int i : map.keySet()){
            if(ans < map.get(i)){
                ans = map.get(i);
                ansk = i;
            }
        }
        System.gc();
        return ansk;
    }
}