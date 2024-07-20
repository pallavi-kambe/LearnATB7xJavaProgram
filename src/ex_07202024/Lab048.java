package ex_07202024;
import java.util.Scanner;
public class Lab048 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        char ch=sc.next().charAt(2);

        switch(ch){
            case 'a','e','i','o','u':
                System.out.println("This is a vowel");
                break;
            default:
                System.out.println("please enter a word");
        }
    }
}
