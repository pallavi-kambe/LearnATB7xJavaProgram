package ex_07202024;
import java.util.Scanner;

public class Lab061 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

        if(n % 3==0)
        {
            System.out.println("Fizz");
        }
        else if(n%5==0)
        {
            System.out.println("Buzz");
        }
        else{
            System.out.println("FizzBuzz");
        }
    }
}
