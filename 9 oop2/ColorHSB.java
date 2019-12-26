/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class ColorHSB {
    //variables
    private final int h0, s0, b0;

    // Creates a color with hue h, saturation s, and brightness b.
    public ColorHSB(int h, int s, int b) {
        h0 = h;
        s0 = s;
        b0 = b;
        if (h < 0 || h > 359)
            throw new IllegalArgumentException("the hue must be between 0 and 359");
        if (s < 0 || s > 100)
            throw new IllegalArgumentException("the saturation must be between 0 and 100");
        if (b < 0 || b > 100)
            throw new IllegalArgumentException("the brightness must be between 0 and 100");

    }

    // Returns a string representation of this color, using the format (h, s, b).
    public String toString() {
        return " (" + h0 + ", " + s0 + ", " + b0 + ")";

    }

    // Is this color a shade of gray?
    public boolean isGrayscale() {
        return (s0 == 0 || b0 == 0);
    }

    // Returns the squared distance between the two colors.
    public int distanceSquaredTo(ColorHSB that) {
        if (that == null)
            throw new IllegalArgumentException("the argument is invalid");
        int min = (int) Math
                .min((Math.pow(that.h0 - h0, 2)), Math.pow(360 - Math.abs(that.h0 - h0), 2));
        int dis = min + (int) Math.pow(that.s0 - s0, 2)
                + (int) Math.pow(that.b0 - b0, 2);
        return dis;
    }


    // Sample client (see below).
    public static void main(String[] args) {
        int hue = Integer.parseInt(args[0]);
        int sat = Integer.parseInt(args[1]);
        int bri = Integer.parseInt(args[2]);

        /////initialize///////
        ColorHSB color = new ColorHSB(hue, sat, bri);
        //StdOut.println(color);
        int mindis = 30000;
        String predefined = "aaa";
        ColorHSB mincolor = new ColorHSB(20, 40, 100);

        while (!StdIn.isEmpty()) {
            String s = StdIn.readLine();
            int h = Integer.parseInt(s.substring(s.length() - 11, s.length() - 8).replace(" ", ""));
            int sa = Integer.parseInt(s.substring(s.length() - 7, s.length() - 4).replace(" ", ""));
            int b = Integer.parseInt(s.substring(s.length() - 3).replace(" ", ""));
            //System.out.println(h + sa + b);

            //StdOut.print(color.distanceSquaredTo(ColorHSB(h, sa, b)));
            ColorHSB colorcompare = new ColorHSB(h, sa, b);

            ///////that////是这样使用的吗？
            if (color.distanceSquaredTo(colorcompare) < mindis) {
                mindis = colorcompare.distanceSquaredTo(color);
                predefined = s;
                mincolor = colorcompare;
                //StdOut.println("colorcompare=" + colorcompare.toString());

            }
        }
        //StdOut.println(mindis);
        // StdOut.println(predefined);
        // StdOut.println(color.toString());
        StdOut.println(predefined.substring(0, predefined.indexOf(" ")) + mincolor.toString());


    }
}
