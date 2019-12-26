/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class MergeSort {

    public static void sort(int a[]) {
        if (a[0] > a[1]) {
            int t = a[1];
            a[1] = a[0];
            a[0] = t;
        }
    }

    public static void merge(int[] a, int[] b) {
        int k = 0;
        int i = 0, j = 0;
        int[] c = new int[a.length + b.length];
        while (k < a.length + b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            }
            else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
    }
    //public static void copy(int)

    public static void mergeSort(int a[]) {
        if (a.length > 2) {
            int b = a.length / 2;
            int[] bleft = new int[b];
            int[] bright = new int[a.length - b];
            for (int i = 0; i < b; i++) {
                bleft[i] = a[i];
                System.out.print("bleft" + bleft[i] + " ");

            }
            for (int i = 0; i < bright.length; i++) {
                bright[i] = a[i + b];
                System.out.print("bright" + bright[i] + " ");

            }
            System.out.println();

            mergeSort(bleft);

            mergeSort(bright);

            merge(bleft, bright);
         /*
            for (int i = 0; i < bleft.length + bright.length; i++) {
                if (bleft[i] < bright[i]) {
                    a[i] = bleft[i];
                }
                else {
                    a[i] = bright[i];
                }
            }

          */


        }


    }

    public static void main(String[] args) {
        int a[] = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            a[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        mergeSort(a);


    }

}
