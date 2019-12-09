/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 *
 *  Manhattan distance = |x0-x1| +|y0-y1|
 **************************************************************************** */

public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;

        int count = 0;
        //int random = (int) (ra * 4);
        // System.out.println(ra + " " + random);

        for (int i = 0; (Math.abs(x) + Math.abs(y)) < r; i++) {
            System.out.println("(" + x + "," + y + ")");

            double ra = Math.random();
            int random = (int) (ra * 4);

            if (random < 1) {
                x += 1;
            }
            else if (random < 2) {
                x -= 1;
            }
            else if (random < 3) {
                y += 1;
            }
            else if (random < 4) {
                y -= 1;
            }
            count += 1;
        }
        System.out.println("(" + x + "," + y + ")");

        System.out.println("steps = " + count);
    }
}
