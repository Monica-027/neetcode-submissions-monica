class Solution {

    public boolean validSub(char[][] board, int sr, int er, int sc, int ec){
        Set<Character> seen = new HashSet<>();
        for(int row= sr; row<=er; row++){
            for(int col = sc; col<=ec; col++){
                if(board[row][col] == '.') continue;
                if(seen.contains(board[row][col])) return false;
                seen.add(board[row][col]);
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        
        //Check duplicate num for rows
        for(int row = 0; row<9; row++){
            Set<Character> seen = new HashSet<>();
            for(int col = 0; col< 9; col++){
                if(board[row][col] == '.') continue;
                if(seen.contains(board[row][col]))
                    return false;
                seen.add(board[row][col]);
            }
        }

        //Check duplicate for cols
        for(int col = 0; col<9; col++){
            Set<Character> seen = new HashSet<>();
            for(int row =0; row<9; row++){
                if(board[row][col] == '.') continue;
                if(seen.contains(board[row][col]))
                    return false;
                seen.add(board[row][col]);
            }
        }

        //check duplicate for 3x3 grid
        // outer loop count starts from 0, 3, 6
        for(int sr = 0; sr<9; sr+=3){
            int er = sr+2;
            for(int sc= 0; sc<9; sc+=3){
                int ec = sc + 2;
                //if this return true means there is no duplicate in 3*3 grid
                // so, !true -> false if block wont return anything
                if(!validSub(board, sr, er, sc, ec)){
                    return false;
                }
            }
        }
        return true;
    }
}
