package tutorial.BlackRock;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class blackrockQ1 {
    
    public static final String SEPARATOR = "@";
    /*
     * Complete the function below.
     *
 	 * Note: The questions in this test build upon each other. We recommend you
	 * copy your solutions to your text editor of choice before proceeding to
	 * the next question as you will not be able to revisit previous questions.
	 */
 

    static int countHoldings(String input) {

        return input.split("@").length;
    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int res;
        String _input;
        try {
            _input = in.nextLine();
        } catch (Exception e) {
            _input = null;
        }
        res = countHoldings(_input);
        System.out.println(res);
    }
}
