/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Checkerboard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        StdDraw.setScale(0, n);
        StdDraw.setPenColor(StdDraw.BLUE);
        //StdDraw.filledSquare(0, 0, 1);
        //StdDraw.filledSquare(0.5, 0.5, 0.5);
        //StdDraw.filledSquare(0.5, 4.5, 0.5);
        //StdDraw.filledSquare(4, 4, 1);


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {


                if ((i + j) % 2 == 0) {

                    StdOut.println("i=" + i);
                    StdDraw.setPenColor(StdDraw.BLUE);
                    StdDraw.filledSquare(0.5 + j, i + 0.5, 0.5);
                }
                else {

                    StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
                    StdDraw.filledSquare(0.5 + j, i + 0.5, 0.5);
                }

            }


        }
    }
}
