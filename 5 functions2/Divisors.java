/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Divisors {

    // Returns the greatest common divisor of a and b.
    public static int gcd(int a, int b) {
        if (a == 0 && b == 0) {
            return 0;
        }
        while (Math.abs(b) != 0) {
            int t = Math.abs(b);
            b = Math.abs(a) % Math.abs(b);
            a = t;
        }
        return a;
    }


    // Returns the least common multiple of a and b.
    public static int lcm(int a, int b) {
        if (a == 0 && b == 0) {
            return 0;
        }
        int t = gcd(a, b);
        return Math.abs(a) * Math.abs(b) / t;

    }


    // Returns true if a and b are relatively prime; false otherwise.
    public static boolean areRelativelyPrime(int a, int b) {
        int t = gcd(a, b);
        return t == 1;
    }


    // Returns the number of integers between 1 and n that are
    // relatively prime with n.
    public static int totient(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (areRelativelyPrime(i, n)) {
                count++;
            }

        }
        return count;
    }

    // Takes two integer command-line arguments a and b and prints
    // each function, evaluated in the format (and order) given below.
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        StdOut.println("gcd(" + x + ", " + y + ") = " + gcd(x, y));
        StdOut.println("lcm(" + x + ", " + y + ") = " + lcm(x, y));
        StdOut.println("areRelativelyPrime(" + x + ", " + y + ") = " + areRelativelyPrime(x, y));
        StdOut.println("totient(" + x + ") = " + totient(x));
        StdOut.println("totient(" + y + ") = " + totient(y));


    }
}
