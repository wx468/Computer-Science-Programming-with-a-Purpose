/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class InsertionSort {
    /*
        public static void exchange(int a, int b) {
            int t = a;
            a = b;
            b = t;

        }

     */
    public static void exchange1(int a[], int j, int i) {
        int t = a[j];
        a[j] = a[i];
        a[i] = t;
    }

    public static void main(String[] args) {
        int a[] = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            a[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        for (int i = 1; i < a.length; i++) {
            //   int t = a[i];

            for (int j = i - 1; j >= 0; j--) {
                if (a[j] > a[j + 1])
                    exchange1(a, j, j + 1);
            }
/*
                if (t < a[j]) //exchange(a[i], a[j]);
                {
                    a[j + 1] = a[j];
                    a[j] = t;
                }
            }

 */
        }
        System.out.println();
        System.out.println("After INSERTION SORT:");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}//2 6 9
