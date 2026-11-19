class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        /*
            - loop to resolve the row first.
            - then binary search on the selected row.
        */
        int m = matrix.length, n = matrix[0].length;

        for (int i = 0; i < m; i++) {
            if (target < matrix[i][0]) {
                return false;
            }

            if (target >= matrix[i][0] && target <= matrix[i][n-1]) {
                // search only in this row -- binary search

                int start = 0, end = n - 1;
                int new_ind = 0;

                while (start <= end) {
                    new_ind = start + (end - start) / 2;
                    if (target > matrix[i][new_ind]) {
                        start = new_ind + 1;
                    }
                    else if (target < matrix[i][new_ind]) {
                        end = new_ind - 1;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
