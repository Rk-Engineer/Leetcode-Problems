class Solution {
    private boolean helper(int row,int col ,String word,char[][] board,int index){
        // base case 
        //1. if  word match 
        if(index == word.length()) return true ;
        //2. boundary conditions
        if(row <0 || col <0 || row > board.length-1 || col > board[0].length-1 ) return false ;
        //3. if character not match
        if(word.charAt(index) != board[row][col]) return false ;
        //4. if char match in recurrsion
        char c =board[row][col];
        board[row][col] ='*';
        boolean res = (helper(row+1,col,word,board,index+1)) || (helper(row-1,col,word,board,index+1)) || (helper(row,col+1,word,board,index+1)) || (helper(row,col-1,word,board,index+1)) ;
        board[row][col] = c ;
        return res ;

    }
    public boolean exist(char[][] board, String word) {
        int row =board.length,col =board[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                // recursive 
                if(helper(i,j,word,board,0)) return true ;
            }
        }
        return false ;
    }
}