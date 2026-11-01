class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<String, Integer> countR = new HashMap<>();
        Map<String, Integer> countC = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            countR = new HashMap<>();
            countC = new HashMap<>();
            for (int j = 0; j < 9; j++) {
                // i,j case -- row wise
                if (board[i][j] != '.') {
                    if (countR.get(String.valueOf(board[i][j])) != null) {
                        // System.out.println("R :: i: " + i + "; j: " + j + "; ITEM ADDED: " + board[i][j]);
                        return false;
                    } else {
                        // System.out.println("R :: i: " + i + "; j: " + j + "; ITEM ADDED: " + board[i][j]);
                        countR.put(String.valueOf(board[i][j]), 1);
                    }
                }
                // j,i case -- col wise
                if (board[j][i] != '.') {
                    if (countC.get(String.valueOf(board[j][i])) != null) {
                        // System.out.println("C :: i: " + i + "; j: " + j + "; ITEM ADDED: " + board[i][j]);
                        return false;
                    } else {
                        // System.out.println("C :: i: " + i + "; j: " + j + "; ITEM ADDED: " + board[i][j]);
                        countC.put(String.valueOf(board[j][i]), 1);
                    }
                }
            }
        }

        HashMap<String, Integer>[] countSQ = new HashMap[9];
        for (int i = 0; i < 9; i++) {
            countSQ[i] = new HashMap<>();
        }

        // grid
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int sqIndex = (i / 3) * 3 + (j / 3);
                if (board[i][j] != '.') {
                    // System.out.println("i: " + i + "; j: " + j + "; sqINdex: " + sqIndex + "; boardItem: " + board[i][j] + "; ispresent: " + countSQ[sqIndex].get(board[i][j]));
                    if (countSQ[sqIndex].get(String.valueOf(board[i][j])) != null) {
                        return false;
                    } else {
                        // System.out.println("ITEM ADDED: " + board[i][j]);
                        countSQ[sqIndex].put(String.valueOf(board[i][j]), 1);
                    }
                }
            }
        }

        return true;
    }
}
