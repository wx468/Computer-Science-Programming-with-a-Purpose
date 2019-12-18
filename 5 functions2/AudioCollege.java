/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class AudioCollege {
    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * alpha;
        }
        return a;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        double b[] = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];
        }
        return b;

    }

    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        double c[] = new double[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[i + a.length] = b[i];
        }
        return c;
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        double c[];
        if (a.length < b.length) {
            c = new double[b.length];
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i];
            }
            for (int i = 0; i < c.length; i++) {
                c[i] += b[i];
            }

        }
        else {
            c = new double[a.length];
            for (int i = 0; i < b.length; i++) {
                c[i] = b[i];
            }
            for (int i = 0; i < c.length; i++) {
                c[i] += a[i];
            }


        }
        return c;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        double[] b = new double[(int) (a.length / alpha)];
        for (int i = 0; i < b.length; i++) {
            b[i] = a[(int) (i * alpha)];
        }

        return b;

    }

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args) {
        //StdOut.print("Type the song name: ");
        // double[] v = StdAudio.read("singer.wav");
       /*
        for (int i = 0; i < w.length; i++) {

            StdOut.println(w[i] + " ");
*/
        //StdAudio.play("piano.wav");

        double[] v1 = amplify(StdAudio.read("cow.wav"), 20);
       /*
        for (int i = 0; i < w.length; i++) {
            StdOut.print(w1[i] + " ");

        }

*/
        StdAudio.play(v1);

        double[] w = reverse(StdAudio.read("piano.wav"));
        StdAudio.play(w);

        double[] x = merge(StdAudio.read("buzzer.wav"), StdAudio.read("cow.wav"));
        StdAudio.play(x);

        double[] y = mix(StdAudio.read("dialup.wav"), StdAudio.read("singer.wav"));
        StdAudio.play(y);

        double[] z = changeSpeed(StdAudio.read("cow.wav"), 0.25);
        StdAudio.play(z);


        //      double[] a = { 1, 2, 3, 4, 5 };
/*        double[] b = { 100, 200, 300 };
        double alpha = 2;

        double[] v = amplify(a, alpha);
        StdAudio.play(a);

        double[] w = reverse(a);
        StdAudio.play(w);

        double[] x = merge(a, b);
        StdAudio.play(x);

        double[] y = mix(a, b);
        StdAudio.play(y);

        double[] z = changeSpeed(a, alpha);
        StdAudio.play(z);

        double[] v = amplify(a, alpha);
        for (int i = 0; i < v.length; i++) {
            StdOut.print(v[i] + " ");

        }


        double[] w = reverse(a);
        StdOut.println();
        for (int i = 0; i < w.length; i++) {
            StdOut.print(w[i] + " ");

        }


        double[] x = merge(a, b);
        StdOut.println();

        for (int i = 0; i < x.length; i++) {
            StdOut.print(x[i] + " ");

        }

        double[] y = mix(a, b);
        StdOut.println();

        for (int i = 0; i < y.length; i++) {
            StdOut.print(y[i] + " ");

        }

        double[] z = changeSpeed(a, 2);

        StdOut.println(z.length);


        for (int i = 0; i < z.length; i++) {
            StdOut.print(z[i] + " ");

        }
*/

    }
}
