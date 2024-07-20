package ex_07202024;
import java.util.Scanner;

public class Lab050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value");
         String val1 = sc.next();

        System.out.println("Enter the second value");
        String val2=sc.next();

        System.out.println("Enter the third value");
        String val3 = sc.next();

        if(val1.equals(val2) && val2.equals(val3) && val1.equals(val3))
        {
            System.out.println("Same value");
        }
        else if(val1.equals(val2) ||val2.equals(val3) ||val1.equals(val3))
        {
            System.out.println("two value are similar");
        }
        //if (val1!=val2 && val2!=val3 && val1!=val3)
        else
        {
            System.out.println("The values are different");
        }

    }

}
