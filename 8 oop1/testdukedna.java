/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 *
 * METHOD 2======
 * startindex=a.indexOf
 * if (startindex==-1)// means no "kkk"
 * {
 * System.out.println("not find")
 * {
 * endindex = a.indexOf("ooo",startindex+3)
 **************************************************************************** */

public class testdukedna {
    public static void main(String[] args) {
        String a = "abckkkjiooo";
        int start = 0;
        int end = 0;
        for (int i = 0; i < a.length() - 2; i++) {
            String codon = a.substring(i, i + 3);
            if (codon.equals("kkk")) {
                start = i;
            }
            if (codon.equals("ooo")) {
                end = i + 3;
            }
        }

        System.out.printf("dna= %s", a.substring(start, end));


    }
}
