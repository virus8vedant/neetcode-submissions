class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length, n = matrix[0].length;

        // System.out.println("m: " + m + " :: n: " + n);


        // for (int i = 0; i < m*n; i ++) {
        int start = 0, end = (m * n) - 1;

        while (end >= start) {
            int mid = start + (end - start) / 2;

            int row = mid / n, col = mid % n;

            // System.out.println("row: " + row + " :: col: " + col + " :: mid: " + mid);

            int curr = matrix[row][col];

            if (curr == target) return true;
            else if (curr > target) end = mid - 1;
            else if (curr < target) start = mid + 1;
        }

        return false;
    }

}

/*

0: 0 1 2 
1: 0 1 2
2: 0 1 2

 0 1 2
 3 4 5
//  6 7 8

 m = 2
 n = 3

 4: 1, 

 i = n * row + col
 row = i / n;
 col = i % n;

i goes from 0 to m*n:
    for each i, row = 
*/