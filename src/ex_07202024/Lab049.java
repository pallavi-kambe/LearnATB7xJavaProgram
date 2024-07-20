package ex_07202024;
import java.util.Scanner;

public class Lab049 {
    public static void main(String[] args) {
        //Tringle classification
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value");
        int val1 = sc.nextInt();

        System.out.println("Enter the second value");
        int val2 = sc.nextInt();

        System.out.println("Enter the third value");
        int val3 = sc.nextInt();

        if(val1==val2 && val2==val3 && val1==val3){
            System.out.println("It is equilaterial triangle");
        }
        else if(val1==val2 || val2==val3 || val1==val3){
            System.out.println("It is isosceles");
        }
        else{
            System.out.println("It is Scalene");
        }



    }
}
