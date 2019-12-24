/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

import edu.duke.FileResource;

public class HelloWorld {

    public void runHello() {
        FileResource res = new FileResource("hello_unicode.txt");
        for (String line : res.lines()) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        HelloWorld r = new HelloWorld();
        r.runHello();
    }
}

