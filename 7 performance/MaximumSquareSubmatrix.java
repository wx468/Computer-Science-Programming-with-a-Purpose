/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class MaximumSquareSubmatrix {
    // Returns the size of the largest contiguous square submatrix // of a[][] containing only 1s.
    public static int size(int[][] a) {
        int n = a.length;
        int[][] s = new int[n][n];
        for (int i = 0; i < n; i++) {
            s[0][i] = a[0][i];
            s[i][0] = a[i][0];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (a[i][j] == 1)
                    s[i][j] = Math.min(s[i - 1][j], Math.min(s[i][j - 1], s[i - 1][j - 1])) + 1;
            }
        }
        //Arrays.sort(s);

        int size = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (s[i][j] > size) size = s[i][j];
            }

        }
        return size;
    }


    // Reads an n-by-n matrix of 0s and 1s from standard input
    // and prints the size of the largest contiguous square submatrix // containing only 1s.
    public static void main(String[] args) {
        int n = StdIn.readInt();

        int[][] a = new int[n][n];

        while (!StdIn.isEmpty()) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = StdIn.readInt();
                    // StdOut.print(a[i][j] + " ");
                }
                // StdOut.println();
            }
        }

        StdOut.println(size(a));
    }
}

    /*
    public static void main(String[] args) {
       /*
        int n = StdIn.readInt();
        StdOut.print("n=" + n);
        StdOut.println();


        int[][] a = new int[n][n];

        while (!StdIn.isEmpty()) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = StdIn.readInt();
                    StdOut.print(a[i][j] + " ");
                }
                StdOut.println();
            }
        }
        //int[][] a = StdIn.readInt();

        int n = 6;
        int[][] a = {
                { 0, 1, 1, 0, 1, 1 }, { 1, 1, 0, 1, 0, 1 }, { 0, 1, 1, 1, 0, 1 },
                { 1, 1, 1, 1, 1, 0 }, { 1, 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1 }
        };

        int[][] s = new int[n][n];
        for (int i = 0; i < n; i++) {
            s[0][i] = a[0][i];
            s[i][0] = a[i][0];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (a[i][j] == 1)
                    s[i][j] = Math.min(s[i - 1][j], Math.min(s[i][j - 1], s[i - 1][j - 1])) + 1;
            }
        }
        //Arrays.sort(s);


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                StdOut.print(s[i][j] + " ");
            }
            StdOut.println();

        }
        int size = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (s[i][j] > size) size = s[i][j];
            }

        }
        StdOut.print(size);
    }
}

*/
////////////check////////////
       /* for (int i = 0; i < n; i++) {
            int[][] size = new int[n][n];
            for (int j = 0; j < n; j++) {
                //int[] count = new int[n];
                int count = 0;
                if (a[i][j] != 0) {
                    for (int m = j; a[i][m] != 0; m++) {
                        for (int k = i; a[k][m] != 0; k++) {
                            count++;
                        }


                    }
                    if (count)
                        Arrays.sort(count);
                    size[i][j] = count[0];
                    StdOut.println("size" + i + "," + "j=" + size[i][j]);

                }
                StdOut.println("i=" + i);

                //StdOut.println("count" + j + "=" + count[j]);


            }

        }
    }
}
*/
