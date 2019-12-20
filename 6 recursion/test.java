/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class test {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        //  StdOut.println(trinomial(n, k));

        long[][] array = new long[n + 1][n + 2];
        for (int i = 0; i < n + 1; i++) {
            array[i][n + 1] = 0;
            StdOut.print("array" + i + "," + (n + 1) + "=" + array[i][n + 1] + " ");

        }
        StdOut.println();
        // if (n == 0 && k == 0) return 1;
        //  if (k < -n || k > n) return 0;
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                if (i == 0 && j == 0) array[i][j] = 1;
                else if (j < -i || j > i) array[i][j] = 0;
                else {
                    if (j + 1 > i - 1) {
                        array[i - 1][j + 1] = 0;
                    }
                    array[i][j] = array[i - 1][Math.abs(j - 1)] + array[i - 1][j] + array[i
                            - 1][j + 1];
                }

                StdOut.print("array" + i + "," + j + "=" + array[i][j] + " ");

            }
            StdOut.println();

        }
        StdOut.print("array" + n + "," + k + "=" + array[n][k] + " ");


    }
}
