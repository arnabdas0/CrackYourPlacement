class Solution {
    public int countBinarySubstrings(String s) {
        int count = 0;
        char[] sArr = s.toCharArray();
        char pVal = sArr[sArr.length - 1];
        for (int i = s.length() - 2, pre = 0, curr = 1; i >= 0; i--) {
            if (sArr[i] == pVal) {
                if (pre >= ++curr) count++;
            } else {
                pVal = sArr[i];
                pre = curr;
                curr = 1;
                count++;
            }
        }
        return count;
    }
}