/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class test2 {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4 };
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        //int arrayb[] = new int[array.length];
        //arrayb = array;

        int arrayb[] = array;
        for (int i = 0; i < array.length; i++) {
            System.out.println("arrayb" + arrayb[i]);
        }

        int a = 2;
        double b = 0.25;

        System.out.println((int) (a * b));


    }
}
