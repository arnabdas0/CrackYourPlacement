class Solution {
    public String toLowerCase(String s) {
        char ch[] = s.toCharArray();
        for(int i=0; i<ch.length; i++){
            if((int)ch[i]<91 && (int)ch[i]>64){
                ch[i] = (char)((int)ch[i]+32);
            }
        }

        String ans = "";
        for(char c:ch){
            ans+=c;
        }

        return ans;
    }
}