class Solution {
    public boolean isSafe(char[][] board, int r, int c, char n){
        //same row
        for(int j=0; j<9; j++){
            if(board[r][j] == n){
                return false;
            }
        }
        //same col
        for(int i=0; i<9; i++){
            if(board[i][c] == n){
                return false;
            }
        }
        //same grid
        int sx = (r/3)*3;
        int sy = (c/3)*3;
        for(int i=sx; i<sx+3; i++){
            for(int j=sy; j<sy+3; j++){
                if(board[i][j] == n){
                    return false;
                }
            }
        }

        return true;
    }
    public boolean helper(char[][] board, int i, int j){
        if(i==9){
            return true;
        }
        int nextI = i;
        int nextJ = j+1;
        if(j+1 == 9){
            nextI = i+1;
            nextJ = 0;
        }

        //already placed
        if(board[i][j] != '.') {
            return helper(board, nextI, nextJ);
        }
        for(char n='1'; n<='9'; n++){
            if(isSafe(board, i, j, n)){
                board[i][j] = n;
                if(helper(board, nextI, nextJ)){
                    return true;
                }
                board[i][j] = '.';
            }
        }

        return false;
    }
    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }
}