class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length-1;
        int i = 0 ;

        while( i<row && col >=0 ){
            // case 1 : element found --> return true
            if(matrix[i][col] == target)  return true ;

            // case 2 : if element found in this row 
            else if (matrix[i][col] > target ) col-- ;

            // case 3 ; if element not found in this row ;
            else i++;
        }

        return false ;
    }
}