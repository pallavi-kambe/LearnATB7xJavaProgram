package ex_07142024;

import java.util.Locale;

public class Lab105 {
    public static void main(String[] args) {
        String s1_name= "Pallavi";
        String s2_name = new String("Pallavi");

        System.out.println(s1_name.charAt(3));
        System.out.println(s2_name.toLowerCase());
        System.out.println(s2_name.toUpperCase());
        System.out.println(s2_name.charAt(5));

        String name = "Pramod";
        // String? - // Bunch of Chars - Collection of Chars
        // class - ?
        String name2 = new String("Pramod");
        // How many ways we can a String - 2
        // = , new operator
        // = "SCP" // Sting constant Pool
        // new - Objects(heap)
    }
}
