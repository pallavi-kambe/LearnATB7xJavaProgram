package ex_07212024;
import java.util.Scanner;

public class Lab083 {
    //Factorial with Scanner class
    public static void main(String[] args) {
        int a=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a maximum number");
        int n=sc.nextInt();

        for(int i=1; i<=n;i++){
            a=a*i;
        }
        System.out.println(a);
    }
}
