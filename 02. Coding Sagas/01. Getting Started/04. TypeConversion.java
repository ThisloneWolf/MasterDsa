/**
 *  Type Conversions
 *  Upcasting Implicit Conversion
 *  Downcasting Explicit Conversion
 */

import java.util.*;

class Main {
    public static void main (String[] args) {
        System.out.println("10 + 20");
        System.out.println("A + B");
        System.out.println(10 + "20");
        System.out.println(10 + 20 + "10 + 20" + 10 + 20);

        // Upcasting happens implicity here, since char[2bytes] can be adjusted easily in int [4bytes]
        int num = 'a';
        System.out.println(num);

        int num_2 = 'a' + 5;
        System.out.println(num_2);

        System.out.println("a" + "b");
        System.out.println('a' + 'b');


        int number = 100;
        long doubleNumber = number;
        System.out.println(doubleNumber);

        // Downcasting : Explicit Conversion with data loss as Long is being fit in Integer

        long data = 99999931999l;
        int compressed = (int)data; // 8byte ----> 4byte
        System.out.println(compressed);


        // Downcasting examples

        char ch1 = (char)97;   // int (4byte) ----> char (2byte)
        System.out.println(ch1);
    }
}
