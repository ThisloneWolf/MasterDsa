/**
 *  UNICODE is the superset of ASCII
 *  A - 65, Z - 90
 *  a - 97, z - 122
 *  Arithmetic Operations
*/

import java.util.*;

class Main {
    public static void main (String[] args) {
        char initial = 'a';
        System.out.println(initial);

        char hindi_char = '\u0917';
        System.out.println(hindi_char);

        int a = 10, b = 20;
        int c = a + b;
        System.out.println(c);

        // Int / Int ----- Results in Integer with floor division, decimal will be truncated
        System.out.println(7/2);

        // Double / Integer will result in Decimal or vice versa
        System.out.println(3.0 / 2);

        double num = 3 / 2;
        System.out.println(num);

        System.out.println(3 % 2);
    }
}