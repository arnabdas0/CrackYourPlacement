class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        char ch[] = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int val[] = {1, 5, 10, 50, 100, 500, 1000};

        for(int i=0; i<7; i++){
            map.put(ch[i], val[i]);
        }

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                ans -= map.get(s.charAt(i));
            } else {
                ans += map.get(s.charAt(i));
            }
        }

        return ans;
    }
}