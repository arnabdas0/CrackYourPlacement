class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int sRow = 0;
        int sCol = 0;
        int eRow = matrix.length-1;
        int eCol = matrix[0].length-1;
        
        while(sRow<=eRow && sCol<=eCol){
            //top
            for(int i=sCol; i<=eCol; i++){
                ans.add(matrix[sRow][i]);
            }

            //right
            for(int i=sRow+1; i<=eRow; i++){
                ans.add(matrix[i][eCol]);
            }

            //bottom
            for(int i=eCol-1; i>=sCol; i--){
                if(sRow == eRow){
                    break;
                }
                ans.add(matrix[eRow][i]);
            }

            //left
            for(int i=eRow-1; i>=sRow+1; i--){
                if(sCol == eCol){
                    break;
                }
                ans.add(matrix[i][sCol]);
            }

            sRow++;
            sCol++;
            eRow--;
            eCol--;
        }

        return ans;
    }
}