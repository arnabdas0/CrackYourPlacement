class Solution {
    public String toHex(int num) {
        if(num == 0) return "0";
        StringBuilder sb = new StringBuilder();
        long res = num;
        if(num<0){
           res = (long)(Math.pow(2,32) + num);
        }
        while(res != 0){
            int rem = (int)(res%16);
            res = res/16;
            if(rem < 10) {
                sb.insert(0,rem);
            } else{
                sb.insert(0,(char)(rem + 87));
            }
        }

        return sb.toString();
    }
}