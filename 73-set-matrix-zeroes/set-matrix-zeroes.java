class Solution {
    public void setZeroes(int[][] matrix) {
       int rows = matrix.length;
       int cols = matrix[0].length;
       boolean zerosRow[] = new boolean[rows];
       boolean zerosCol[] = new boolean[cols];

       for(int i=0; i<rows; i++){
           for(int j=0; j<cols; j++){
               if(matrix[i][j] == 0){
                   zerosRow[i] = true;
                   zerosCol[j] = true;
               }
           }
       }

       for(int i=0; i<rows; i++){
           for(int j=0; j<cols; j++){
               if(zerosRow[i] || zerosCol[j]){
                   matrix[i][j] = 0;
               }
           }
       }

       for(int i=0; i<rows; i++){
           for(int j=0; j<cols; j++){
               System.out.print(matrix[i][j]+" ");
           }
           System.out.println();
       }
    }
}
