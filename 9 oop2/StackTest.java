/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<Integer>();
        for (int i = 0; i < args.length; i++) {
            a.push(Integer.parseInt(args[i]));
        }

        int n = a.size();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = a.pop();
        }
        for (int i = 1; i < n - 1; i++) {
            System.out.println(array[--i]);
        }
        //System.out.println(array[3++]);


    }
}
