class Solution {
    public boolean exist(char[][] b, String word) {
        for(int i=0; i<b.length; i++){
            for(int j =0; j<b[0].length; j++){
                if(b[i][j] == word.charAt(0) && helper(b, word, 0, i, j)){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean helper(char b[][], String w, int s, int i, int j){
        if(w.length()<=s){
            return true;
        }

        if(i<0 || j<0 || i>=b.length || j>=b[0].length || b[i][j]=='0' || b[i][j]!=w.charAt(s)){
            return false;
        }

        char temp = b[i][j];
        b[i][j] = '0';

        if(helper(b, w , s+1, i+1, j)||
           helper(b, w , s+1, i-1, j)||
           helper(b, w , s+1, i, j+1)||
           helper(b, w , s+1, i, j-1)){
            return true;
        }

        b[i][j] = temp;
        return false;
    }
}