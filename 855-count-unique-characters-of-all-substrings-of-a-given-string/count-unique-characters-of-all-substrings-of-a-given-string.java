class Solution {
    public int uniqueLetterString(String s) {
        int n = s.length();
        int[] cur = new int[26];
        int[] last = new int[26];
        Arrays.fill(last, -1);
        int total = 0;
        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'A';
            total += (i - last[c]) * cur[c];
            cur[c] = i - last[c];
            last[c] = i;
        }
        for (int i = 0; i < 26; ++i) {
            total += (n - last[i]) * cur[i];
        }
        return total;
    }
}