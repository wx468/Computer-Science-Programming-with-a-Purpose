/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int r;

        int[] count = new int[100];

        // System.out.println("stop = " + stop);
        int stopi = 0;

        for (int k = 0; k < trials; k++) {
            //System.out.println("k=" + k);
            int[] array = new int[100];
            int stop = array.length;
            array[0] = (int) (Math.random() * (n - 1));


            for (int i = 0; i < stop; i++) {
                r = (int) (Math.random() * (n - 1));
                //System.out.println("r = " + r);
                for (int j = 0; j < i; j++) {
                    if (array[j] == r) {

                        //System.out.println("stop = " + i);
                        stop = 0;
                        count[i] += 1;
                        //System.out.println("counti=" + count[i]);
                        stopi = i;
                        break;
                    }
                    else {
                        array[i] = r;

                    }
                    //System.out.println("array" + i + "=" + array[i]);
                    //System.out.println("stop1 = " + stop);
                }


            }
             /*
            for (int i = 0; i < array.length; i++) {
                System.out.print("array=" + array[i] + " ");
                // System.out.println("stopi = " + stopi);
            }
           for (int i = 0; i < array.length; i++) {
                System.out.print("array=" + array[i] + " ");
            }

            for (int i = 0; i < count.length; i++) {
               System.out.print("count=" + count[i] + " ");

            }
            //System.out.println();
            //System.out.println("array0" + "=" + array[0]);

            //System.out.println("stopi = " + stopi);
*/
        }
        /*
        System.out.println();
        for (int i = 0; i < count.length; i++) {
            //System.out.println("hello");
            System.out.print("count" + i + "=" + count[i] + " ");
*/

        // System.out.println();

        double fraction = 0;
        for (int i = 1; fraction < 0.5; i++) {
            fraction += (double) count[i - 1] / trials;
            System.out.println(i + "\t" + count[i - 1] + "\t" + fraction);

        }


    }
}
