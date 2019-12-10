/* *****************************************************************************
 *  Name:             Paradox
 *  Coursera User ID:  123456
 *  Last modified:     7/28/2019
 **************************************************************************** */

public class DiscreteDistribution {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        //int[] array = new int[3];
        //int
        int n = args.length;
        int[] si = new int[n];
        si[0] = 0;
        int sum = 0;
        //System.out.println(n);


        for (int i = 1; i < n; i++) {
            sum += Integer.parseInt(args[i]);
            //System.out.println(args[i]);
            si[i] = sum;
            //System.out.println(i + "." + args[i] + "." + si[i]);

        }
        //System.out.println(si[0] + " " + si[1] + " " + si[2] + " " + si[6]);jav

        for (int i = 1; i <= m; i++) {
            int r = (int) (Math.random() * (si[si.length - 1]));
            //System.out.println(r + "jkl ");

            for (int j = 0; j < n - 1; j++) {
                if (r < si[j + 1] && r >= si[j]) {
                    System.out.print((j + 1) + " ");


                }

            }

        }


    }
}

