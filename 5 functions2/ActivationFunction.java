/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class ActivationFunction {
    // Returns the Heaviside function of x.
    public static double heaviside(double x) {
        if (x < 0) {
            return 0;
        }
        else if (x == 0) {
            return 0.5;
        }
        else if (Double.isNaN(x)) {
            return Double.POSITIVE_INFINITY / Double.POSITIVE_INFINITY;
        }
        return 1;


    }

    // Returns the sigmoid function of x.
    public static double sigmoid(double x) {
        if (Double.isNaN(x)) {
            return Double.POSITIVE_INFINITY / Double.POSITIVE_INFINITY;
        }
        return 1 / (1 + Math.exp(-x));
    }

    // Returns the hyperbolic tangent of x.
    public static double tanh(double x) {
        double tanh = (Math.exp(x) - Math.exp(-x)) / (Math.exp(x) + Math.exp(-x));
        if (Double.isNaN(x)) {
            return Double.POSITIVE_INFINITY / Double.POSITIVE_INFINITY;
        }

        else if (x <= -20) {
            return -1;
        }
        else if (x >= 20) {
            return 1;
        }
        else
            return (tanh);
    }

    // Returns the softsign function of x.
    public static double softsign(double x) {
        double softsign = x / (1 + Math.abs(x));
        if (Double.isNaN(x)) {
            return Double.POSITIVE_INFINITY / Double.POSITIVE_INFINITY;
        }
        else if (x == Double.POSITIVE_INFINITY) {
            return 1;
        }
        else if (x == Double.NEGATIVE_INFINITY) {
            return -1;
        }
        else {


            return (softsign);
        }

    }

    // Returns the square nonlinearity function of x.
    public static double sqnl(double x) {
        if (Double.isNaN(x)) {
            return Double.POSITIVE_INFINITY / Double.POSITIVE_INFINITY;
        }
        else if (x <= -2) {
            return -1;
        }
        else if (x < 0) {
            return x + x * x / 4;
        }
        else if (x < 2) {
            return x - x * x / 4;
        }
        else
            return 1;
    }

    // Takes a double command-line argument x and prints each activation
    // function, evaluated, in the format (and order) given below.
    public static void main(String[] args) {
        //double x = StdIn.readDouble();
        double x = Double.parseDouble(args[0]);
        //double x = Double.NaN;
        StdOut.println("heaviside(" + x + ") = " + heaviside(x));

        StdOut.println("  sigmoid(" + x + ") = " + sigmoid(x));
        StdOut.println("     tanh(" + x + ") = " + tanh(x));

        StdOut.println(" softsign(" + x + ") = " + softsign(x));

        StdOut.println("     sqnl(" + x + ") = " + sqnl(x));

    }
}
