package ex_07142024;

public class Lab100 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + ++a);
        System.out.println(a);
        // A - a++  -> Exp = 10 | a = 11
        // + - operator
        // B- a++  -> Exp = 12 | a = 12
    }
}

