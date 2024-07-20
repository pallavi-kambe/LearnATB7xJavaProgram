package ex_07202024;
import java.util.Scanner;

public class Lab060 {
    public static void main(String[] args) {
        //Leap year
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();

        if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0))
        {
            System.out.println("year is a leap year");
        }
        else{
            System.out.println("This year is not a leap year");
       }


    }
}
