/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class testPrinf {
    public static void main(String[] args) {
        String name1 = "Sai";
        String name2 = "Gautham";
        int marks1 = 100;
        int marks2 = 99;
        System.out.format("%-10s - %4d\n", name1, marks1);
        System.out.format("%-10s - %4d\n", name2, marks2);

        System.out.format("%-10s - %2d\n", name1, marks1);
        System.out.format("%-10s - %2d\n", name2, marks2);

        System.out.format("%-4s - %2d\n", name1, marks1);
        System.out.format("%-4s - %2d\n", name2, marks2);

        System.out.format("%10s - %2d\n", name1, marks1);
        System.out.format("%10s - %2d\n", name2, marks2);

        System.out.format("%-10s - %-102d\n", name1, marks1);
        System.out.format("%-10s - %+2d\n", name2, marks2);
    }
}
