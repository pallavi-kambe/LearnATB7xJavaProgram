package ex_07202024;
import java.util.Scanner;

public class Lab047 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a charecter");
        char c = sc.next().charAt(4);// charAt(any number)
        System.out.println(c);

        switch (c){
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a Vowel");
        }

    }
}
