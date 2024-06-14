class Solution {
    private String ch[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private int val[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

    public String intToRoman(int num) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while(num > 0){
            if(num >= val[i]){
                ans.append(ch[i]);
                num -= val[i];
            }else{
                i++;
            }
        }

        return ans.toString();
    }
}