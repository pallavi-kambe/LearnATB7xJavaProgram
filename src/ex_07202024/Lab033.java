package ex_07202024;

import java.util.Scanner;

public class Lab033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println(age);
        if (age>=18)
        {
            System.out.println("You are eligible");
        }
        else{
            System.out.println("Not eligible");
        }
    }
}