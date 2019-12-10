/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Minesweeper {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int mine = Integer.parseInt(args[2]);

        boolean[][] array = new boolean[m][n];

        //int mine = 15;
        int[][] count = new int[m][n];
        //boolean[] array = new boolean[10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (mine > 0) {
                    array[i][j] = true;
                    mine--;
                }
                else {
                    array[i][j] = false;
                }
            }
        }
        // array with k mines
/*
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }
*/
        // ------------------Mine Shuffle-----------------------
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                // System.out.println("hello");
                int x = (int) (Math.random() * m);
                // System.out.println("world");
                int y = (int) (Math.random() * n);
                boolean t = array[x][y];
                array[x][y] = array[i][j];
                array[i][j] = t;
            }

        }

        //-------------------Print Random Mines---------------
/*

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        */
        //----------------------Creat m+2  n+2 arraybig---------------------
        boolean[][] arraybig = new boolean[m + 2][n + 2];

        for (int i = 0; i < arraybig.length; i++) {
            for (int j = 0; j < arraybig[0].length; j++) {
                if (i == 0 || i == m + 1 || j == 0 || j == n + 1) arraybig[i][j] = false;
                else {
                    arraybig[i][j] = array[i - 1][j - 1];
                }

            }
        }
        //-------------Print arraybig------------
        /*
        for (int i = 0; i < arraybig.length; i++) {
            for (int j = 0; j < arraybig[0].length; j++) {
                System.out.print(arraybig[i][j] + " ");
            }
            System.out.println();
        }
        */

        //----------------------Calculate Count--------------------
        for (int i = 0; i < m; i++) {
            //System.out.println("i=" + i);
            for (int j = 0; j < n; j++) {
                // System.out.println("j=" + j);
                //if (arraybig[i][j]) count[i - 1][j - 1] = "*";


                if (arraybig[i][j]) count[i][j]++;
                if (arraybig[i][j + 1]) count[i][j]++;

                if (arraybig[i][j + 2]) count[i][j]++;

                if (arraybig[i + 1][j]) count[i][j]++;

                if (arraybig[i + 1][j + 2]) count[i][j]++;

                if (arraybig[i + 2][j]) count[i][j]++;

                if (arraybig[i + 2][j + 1]) count[i][j]++;

                if (arraybig[i + 2][j + 2]) count[i][j]++;
            }
        }
        //-------------Print result------------------
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arraybig[i + 1][j + 1]) System.out.print("* ");
                else
                    System.out.print(count[i][j] + " ");
            }
            System.out.println();
        }

    }
}

