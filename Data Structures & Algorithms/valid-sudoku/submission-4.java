class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        boolean[][] gridCheck = new boolean[9][10];

        for (int i = 0; i < 9; i++) {
            boolean[] rowCheck = new boolean[10]; 
            boolean[] colCheck = new boolean[10];

            for (int j = 0; j < 9; j++) {
                // System.out.println("item: " + board[i][j]);
                int num = board[i][j] - '1';
                int num2 = board[j][i] - '1';

                if (board[i][j] != '.') {
                    // row check
                    if (rowCheck[num]) return false;
                    else rowCheck[num] = true;

                    // calc grid number...
                    int gridNum = i/3*3 + j/3;

                    if (gridCheck[gridNum][num]) return false;
                    else gridCheck[gridNum][num] = true;
                }

                // col check
                if (board[j][i] == '.') continue;
                if (colCheck[num2]) return false;
                else colCheck[num2] = true;
            }
        }

        return true;
    }
}

/*
00 01 02    03 04 05    06 07 08
30 31 32    33 34 35    36 37 38
*/
