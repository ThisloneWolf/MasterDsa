/** 
 *  Data types in Java and It's Ranges
 */

import java.util.*;

public class Main {
    public static void main (String[] args) {
        byte number = -128;

        int inf = Integer.MAX_VALUE;
        System.out.println(inf);

        // This results in overflow results in -Infinity i.e Integer Min value has been shown
        int inf_1 = Integer.MAX_VALUE + 1;
        System.out.println(inf_1);

        // Results in +Infinity i.e Integer Max Value
        int inf_2 = Integer.MIN_VALUE - 1;
        System.out.println(inf_2);
 
        // If you don't explicitly mention f, java will throw error as it will treat it as double
        float percentage = 94.5f;
        System.out.println(percentage);

        long num_2 = 21474836482l;
        System.out.print(num_2);


    }
}