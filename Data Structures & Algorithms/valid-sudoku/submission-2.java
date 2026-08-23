class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        Set<Character>[] arr = new Set[9];

        for (int i = 0; i < board.length; i++) {
            arr[i] = new HashSet<Character>();
        }

        for (int i = 0; i < board.length; i++) {
            Set<Character> row = new HashSet<>();
            Set<Character> col = new HashSet<>();

            for (int j = 0 ; j < 9; j++) {
                if (board[i][j] != '.') {

                    // String val = String.valueOf(board[i][j]);
                    char val = board[i][j];

                    if (row.contains(val)) {
                        return false;
                    }
                    row.add(val);

                    int indexGrid = (i/3)*3 + j/3;
                    if (arr[indexGrid].contains(val)) {
                        return false;
                    }
                    arr[indexGrid].add(val);
                }
                if (board[j][i] != '.') {
                    if (col.contains(board[j][i])) {
                        return false;
                    }
                    col.add(board[j][i]);
                }
            }
        }
        return true;
    }
}




/*

for n -> 0 - 9
    for i -> n%3 - n%3+3:  
        for j -> n%3 - n%3+3:  




0 -> 00-22 ----- i:0-2; j:0-2
1 -> 03-25 ----- i:0-2; j:3-5
2 -> 06-28 ----- i:0-2; j:6-8
3 -> 30-52 ----- i:3-5; j:0-2
4
5
6
7
8
9

    0           1           2
00 01 02    03 04 05    06 07 08
10 11 12    13 14 15    16 17 18
20 21 22    23 24 25    26 27 28

    3           4           5
30 31 32    33 34 35    36 37 38
40 41 42    43 44 45    46 47 48
50 51 52    53 54 55    56 57 58

    6           7           8
60 61 62    63 64 65    66 67 68


*/
