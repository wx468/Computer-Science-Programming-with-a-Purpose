/* *****************************************************************************
 *  Name:    Paradox
 *  NetID:   20190726
 *  Precept: P00
 *
 *  Description:  Prints 'Hello, World' to the terminal window.
 *                By tradition, this is everyone's first program.
 *                Prof. Brian Kernighan initiated this tradition in 1974.
 *
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean isRightTriangle;
        isRightTriangle = (a >= 0) && (b >= 0) &&
                (c >= 0) && (a * a + b * b == c * c);

        System.out.println(isRightTriangle);


    }
}
