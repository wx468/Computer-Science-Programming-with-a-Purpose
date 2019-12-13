/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class ShannonEntropy {
    public static void main(String[] args) {
        //int m = Integer.parseInt(args[0]);
        int m = StdIn.readInt();
        double sum = 0;
        //StdOut.print(Math.log(16) / Math.log(2));
        int[] array = new int[m];
        int total = 0;

        while (!StdIn.isEmpty()) {

            double number = StdIn.readInt();

            for (int i = 0; i < m; i++) {
                if (number == i + 1) array[i]++;
            }
            //double hi = p * Math.log(p) / Math.log(2);
            //StdOut.println("hi = " + hi);

            // sum += hi;
            total++;

        }

        StdOut.println("----------array---------");
        StdOut.println(
                array[0] + " " + array[1] + " " + array[2] + " " + array[3] + " " + array[4] + " "
                        + array[5]);

        //StdOut.print(-sum);

        double[] hi = new double[m];
        for (int i = 0; i < m; i++) {
            StdOut.println("test" + i);
            double p = (array[i] / (double) total);
            if (p == 0) {
                hi[i] = 0;
            }
            else {
                hi[i] = p * Math.log(p) / Math.log(2);
            }
            sum += hi[i];
            StdOut.println("test" + i + " =" + hi[i]);

        }
        StdOut.print(-sum);

    }
}
