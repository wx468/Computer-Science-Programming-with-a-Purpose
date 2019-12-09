/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (Math.abs(j - i) <= width) {
                    System.out.print("*  ");

                }
                else {
                    System.out.print("0  ");

                }
                //System.out.println("  ");
                //System.out.println("steps = " + step);

            }
            //System.out.println();
            System.out.println(" ");
            //System.out.println(" ");

        }


    }
}
