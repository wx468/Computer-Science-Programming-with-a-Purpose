/* *****************************************************************************
 *  Name:    Paradox
 *  NetID:   201990726
 *  Precept: P00
 *
 *  Description:  Prints 'Hello, World' to the terminal window.
 *                By tradition, this is everyone's first program.
 *                Prof. Brian Kernighan initiated this tradition in 1974.
 *
 **************************************************************************** */

public class HelloGoodbye {
    public static void main(String[] args) {
        String a = args[0];
        String b = args[1];
        System.out.println("Hello " +
                                   a +
                                   " and " + b);
        System.out.println("Goodbye " + b + " and " + a);


    }
}
