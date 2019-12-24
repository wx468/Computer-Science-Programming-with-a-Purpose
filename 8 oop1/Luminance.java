/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 *
 * Def. The monochrome luminance of a color quantifies its effective brightness.
 *  NTSC standard formula for luminance: 0.299r + 0.587g + 0.114b.
 *
 *
 * java-introcs Luminance 20 40 200
 *
 *20
 *color = java.awt.Color[r=20,g=40,b=200]
 *lum = 52.26

 *三个相同的lum 数据就是该color 所代表的灰色。
 **************************************************************************** */

import java.awt.Color;

public class Luminance {
    public static double lum(Color c) {
        int red = c.getRed();
        System.out.println(red);
        int green = c.getGreen();
        int blue = c.getBlue();
        double lum = 0.299 * red + 0.587 * green + 0.114 * blue;
        return lum;
    }


    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);

        Color c = new Color(i, j, k);
        double lum = lum(c);

        System.out.println("color = " + c);
        System.out.println("lum = " + lum);


    }
}
