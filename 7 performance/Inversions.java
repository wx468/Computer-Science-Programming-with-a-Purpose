/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 *
 *  i>0,j>i count 1 by 1;
 **************************************************************************** */

public class Inversions {

    // Return the number of inversions in the permutation a[].
    public static long count(int[] a) {
        long count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) count++;

            }

        }
        return count;

    }

    // Return a permutation of length n with exactly k inversions.
    public static int[] generate(int n, long k) {
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            // System.out.print("i===" + i + "a=" + a[i] + " ");
        }

        for (int i = 0; k > 0; i++) {

            ///////////////////////k<a.length/////////////////////
            if (k < a.length - (i + 1)) {
                int[] b = new int[a.length];

                b[i] = a[(int) (k + i)];
                for (int j = i; j < k + i; j++) {
                    b[j + 1] = a[j];


                    ///////////can printout//////////
                    //   System.out.print("j==" + (j + 1) + "b=" + b[j + 1] + " ");

                    //k = 0;

                }
                //  System.out.println();

                for (int x = 0; x < a.length; x++) {
                    if (x >= i && x <= k + i)
                        a[x] = b[x];

                    //    System.out.print("i==" + i + "a=" + a[x] + " ");

                }

                //   System.out.println();

                k = 0;
            }
            //  System.out.println();

            ///////////////////////k<a.length/////////////////////

            if (k >= a.length - (i + 1)) {
                int[] b = new int[a.length];

                b[i] = a[a.length - 1];
                for (int j = i; j < a.length - 1; j++) {
                    b[j + 1] = a[j];
                }

                k = k - (a.length - 1 - i);


                for (int x = 0; x < a.length; x++) {
                    if (x >= i)
                        a[x] = b[x];

                    //      System.out.print("i=" + i + "a=" + a[x] + " ");
                }
                //    System.out.println();


            }

            //   System.out.println();
        }

        return a;

    }


    // Takes an integer n and a long k as command-line arguments,
    // and prints a permutation of length n with exactly k inversions.
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        long k = Long.parseLong(args[1]);
        int[] a = generate(n, k);

       /* int[] b = new int[65537];
        for (int i = 65536; i >= 0; i--) {
            b[i] = 65536 - i;
        }
        */
        // long b0 = count(b);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }

        //System.out.print("b0=" + b0);

    }
}

    /*
      public static void main(String[] args) {
        int[] a = new int[args.length];
          for (int i = 0; i < args.length; i++) {
              a[i] = Integer.parseInt(args[i]);
              StdOut.print(a[i] + " ");

          }
         int count = 0;
          for (int i = 0; i < a.length; i++) {
              for (int j = i + 1; j < a.length; j++) {
                  if (a[i] > a[j]) count++;

              }

          }

          StdOut.println("count=" + count);

        /////////////////create  permutations//////////////////////
          int n = 10;
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
            System.out.print("i===" + i + "a=" + a[i] + " ");


        }
        StdOut.println("choose k: ");
        int k = StdIn.readInt();
        for (int i = a.length - 1; i <= k; i--) {
            // if (k >= a.length) {
            int t;
            t = a[i];
            a[i] = a[0];
            a[0] = t;
            k = k - (i - 0);

        for (int i = 0; k > 0; i++) {
            System.out.println("k=" + k);

            ///////////////////////k<a.length/////////////////////
            if (k < a.length - (i + 1)) {
                int[] b = new int[a.length];

                b[i] = a[k + i];
                for (int j = i; j < k + i; j++) {
                    b[j + 1] = a[j];
                    System.out.print("j==" + (j + 1) + "b=" + b[j + 1] + " ");

                    //k = 0;

                }
                System.out.println();

                for (int x = 0; x < a.length; x++) {
                    if (x >= i && x <= k + i)
                        a[x] = b[x];

                    System.out.print("i==" + i + "a=" + a[x] + " ");

                }

                System.out.println();

                k = 0;
            }
            System.out.println();

            ///////////////////////k<a.length/////////////////////

            if (k >= a.length - (i + 1)) {
                int[] b = new int[a.length];

                b[i] = a[a.length - 1];
                for (int j = i; j < a.length - 1; j++) {
                    b[j + 1] = a[j];
                }

                k = k - (a.length - 1 - i);


                for (int x = 0; x < a.length; x++) {
                    if (x >= i)
                        a[x] = b[x];

                    System.out.print("i=" + i + "a=" + a[x] + " ");
                }
                System.out.println();


            }

            System.out.println();
        }

    }


}
    */
