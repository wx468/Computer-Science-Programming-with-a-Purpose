/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class test {
    public static void main(String[] args) {
       /*
        String s = "abc 100 20 10";
        System.out.println(s.indexOf(" "));
        int firstwhite = s.indexOf(" ");

        int secondwhite = s.indexOf(" ", s.indexOf(" ") + 1);
        System.out.println(secondwhite);
        int thirdwhite = s.lastIndexOf(" ");
        System.out.println(thirdwhite);

        int inhue = Integer.parseInt(s.substring(firstwhite + 1, secondwhite));
        System.out.println(inhue);

        int insat = Integer.parseInt(s.substring(secondwhite + 1, thirdwhite));
        System.out.println(insat);

        int last = s.length() - 1;
        System.out.println(last);
        int inbri = Integer.parseInt(s.substring(thirdwhite + 1, s.length()));
        System.out.println(inbri);


        String s = "abc     100    20  10";
        String split = s.replaceAll(" ", "@");
        System.out.println(split);

        String str = "sdfvsdf68fsdfsf8999fsdf09";
        String numberOnly = str.replaceAll("[^0-9]", " ");
        //System.out.println(Arrays.asList(numberOnly.split(" ")));

        System.out.println(numberOnly);
        */

        String s = "Purple  300 100  50";
        String ss = s.substring(s.length() - 11, s.length());
        System.out.println(ss);
        String hue = s.substring(s.length() - 11, s.length() - 8).replace(" ", "");
        String sat = s.substring(s.length() - 7, s.length() - 4).replace(" ", "");
        String bri = s.substring(s.length() - 3).replace(" ", "");

        System.out.println(hue);
        System.out.println(sat);
        System.out.println(bri);


    }
}
