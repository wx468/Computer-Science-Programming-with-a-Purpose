/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double h = 0;

        for (int i = 1; i <= n; i++) {
            h += 1 / (Math.pow(i, r));
            //System.out.println(h);
        }
        System.out.println(h);
        //System.out.println(n + " " + r);
    }
}
