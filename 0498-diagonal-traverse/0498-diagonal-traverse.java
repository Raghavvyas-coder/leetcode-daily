
class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int ans[] = new int[n * m];
        int k = 0;

        for (int d = 0; d < n + m - 1; d++) {
            if (d % 2 == 0) {
                int i = Math.min(d, n - 1);
                int j = d - i;

                while (i >= 0 && j < m) {
                    ans[k++] = mat[i][j];
                    i--;
                    j++;
                }
            } else {
                int j = Math.min(d, m - 1);
                int i = d - j;

                while (j >= 0 && i < n) {
                    ans[k++] = mat[i][j];
                    i++;
                    j--;
                }
            }
        }

        return ans;
    }
}
