/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int step = 0;

        for (int j = 0; j < trials; j++) {

            int x = 0;
            int y = 0;
            //int random = (int) (ra * 4);
            // System.out.println(ra + " " + random);

            for (int i = 0; (Math.abs(x) + Math.abs(y)) < r; i++) {
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
                //System.out.println("(" + x + "," + y + ")");
                step += 1;
            }

            //System.out.println("steps = " + step);

        }
        System.out.println("average number of steps = " + (double) step / trials);

    }
}
