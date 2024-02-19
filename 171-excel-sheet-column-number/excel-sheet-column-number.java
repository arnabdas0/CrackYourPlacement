public class Solution {
    public int titleToNumber(String str) {
        int result = 0;
        for(int i=0;i<str.length(); i++){
            result *= 26;
            result += str.charAt(i)-'A'+1;
        }
        return result;
    }
}