class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<s.length();i++){
            if((int)s.charAt(i) <=90 && (int)s.charAt(i) >=65){
                sb.append((char)(s.charAt(i) + 32 ));
                continue;
            
            }
            sb.append(s.charAt(i));
        } 
        return sb.toString();        
    }
}