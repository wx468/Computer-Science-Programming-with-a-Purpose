/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 *
 *  Math.pow(n, 1 / 3.0)
 **************************************************************************** */

public class Ramanujan {

    // Is n a Ramanujan number?
    public static boolean isRamanujan(long n) {
        int count = 0;

        for (int i = 0; i < Math.pow(n, 1 / 3.0); i++) {
            double b;
            b = Math.pow((n - Math.pow(i, 3)), 1 / 3.0);
            if (Math.abs(b - Math.round(b)) <= 0.0000001) {
                count++;
            }
        }
        return (count == 4);
    }

    // Takes a long integer command-line arguments n and prints true if // n is a Ramanujan number, and false otherwise.
    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        System.out.print(isRamanujan(n));
    }
}
/*
    public static void main(String[] args) {

        long n = Long.parseLong(args[0]);
        int count = 0;

        for (int i = 0; i < Math.pow(n, 1 / 3.0); i++) {
            double b;
            b = Math.pow((n - Math.pow(i, 3)), 1 / 3.0);
            if (Math.abs(b - Math.round(b)) <= 0.0000001) {
                count++;
            }
            // System.out.println(i);
            // System.out.println(b);
            // System.out.println(count);
            // System.out.println();


        }




        for (int i = 0; i < Math.pow(n, 1 / 3.0) - 1; i++) {
            for (int j = i + 1; j < Math.pow(n, 1 / 3.0); j++) {
                if (Math.pow(i, 3) + Math.pow(j, 3) == n) count++;
            }
        }


        System.out.println(count);

        System.out.println(count == 4);

    }
}
*/
