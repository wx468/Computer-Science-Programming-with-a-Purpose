/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class RevesPuzzle {

    public static String hanoi(int n, boolean left) {
        if (n == 0) return " ";
        String move;
        if (left) move = n + "L";
        else move = n + "R";
        return hanoi(n - 1, !left) + move + hanoi(n - 1, !left);

    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdOut.println(hanoi(n, false));
    }










   /* public static String hanoi(int n, boolean left) {
        if (n == 0) return " ";
        String move;
        if (left) move = n + "L";
        else move = n + "R";
        return hanoi(n - 1, !left) + move + hanoi(n - 1, !left);

    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdOut.println(hanoi(n, false));
    }
*/

}
