/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 *
 *  cannot sign a value to "final variable" what should i do?
 **************************************************************************** */

public class Clock {
    /////////variables////////
    private int h0, m0;


    // Creates a clock whose initial time is h hours and m minutes.
    public Clock(int h, int m) {
        h0 = h;
        m0 = m;
    }

    // Creates a clock whose initial time is specified as a string, using the format HH:MM.
    public Clock(String s) {
        //////////what do i need write here?
    }

    // Returns a string representation of this clock, using the format HH:MM.
    public String toString() {
        return h0 + " : " + m0;
    }

    // Is the time on this clock earlier than the time on that one?
    public boolean isEarlierThan(Clock that) {
        if (that.h0 > h0)
            return true;
        if (that.h0 == h0) {
            if (that.m0 > m0)
                return true;
        }
        else
            return false;
    }

    // Adds 1 minute to the time on this clock.
    public void tic() {
        if (m0 == 59) {
            h0 += 1;
            m0 = 0;
        }
        else {
            m0 += 1;
        }
    }

    // Adds Δ minutes to the time on this clock.
    public void toc(int delta) {
        if (m0 + delta > 59) {
            h0 += delta / 60;
            m0 += delta % 60;
        }
    }

    // Test client (see below).
    public static void main(String[] args) {


    }
}
