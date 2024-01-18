class Solution {
    public boolean isSafe(char board[][], int r, int c){
        //vertical up
        for(int i=r-1; i>=0; i--){
            if(board[i][c] == 'Q'){
                return false;
            }
        }
        //left dia
        for(int i=r-1, j=c-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //right dia
        for(int i=r-1, j=c+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public void saveBoard(char board[][], List<List<String>> ans){
        String row = "";
        List<String> newRow = new ArrayList<>();

        for(int i=0; i<board.length; i++){
            row = "";
            for(int j=0; j<board.length; j++){
                if(board[i][j] == 'Q'){
                    row += 'Q';
                }else{
                    row += '.';
                }
            }
            newRow.add(row);
        }
        ans.add(newRow);
    }

    public void nQueens(char board[][], List<List<String>> ans, int r){
        if(r == board.length){
            saveBoard(board, ans);
            return;
        }

        for(int j=0; j<board.length; j++){
            if(isSafe(board, r, j)){
                board[r][j] = 'Q';
                nQueens(board, ans, r+1);
                board[r][j] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char board[][] = new char[n][n];

        nQueens(board, ans, 0);

        return ans;
    }
}