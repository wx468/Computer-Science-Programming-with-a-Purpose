/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class test {
    public static void main(String[] args) {
/*
        String file;
        while (!StdIn.isEmpty()) {
            file = StdIn.readAll();
            StdOut.print(file);
        }
        //StdOut.print(file);
*/

        In in = new In(args[0]);      // input file
        // int n = in.readInt();
        String s = in.readAll();
        StdOut.print(s);
        // String s = StdIn.readAll("dna4.txt"));

        //int i = Integer.parseInt(args[0]);
        // String s = String
        ///////////////////////still not work//////////
        // Scanner scanner = new Scanner(args[0]);
        //  System.out.println(scanner);


        /////////// java-introcs test baboon.png///work//////////
    /*   Picture pic = new Picture(args[0]);
        for (int col = 0; col < pic.width(); col++)
            for (int row = 0; row < pic.height(); row++) {
                Color color = pic.get(col, row);
                Color gray = Luminance.toGray(color);
                pic.set(col, row, gray);
            }
        pic.show();


        Picture pic = new Picture(args[0]);
        System.out.println(pic.width());

        for (int col = 0; col < pic.width(); col++) {
            for (int row = 0; col < pic.height(); row++) {
                Color color = pic.get(col, row);
                System.out.println(color);
                int r = color.getRed();
                int g = color.getGreen();
                int b = color.getBlue();

            }
        }
        */

    }
}
