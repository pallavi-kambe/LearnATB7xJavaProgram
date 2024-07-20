package ex_07202024;
import java.util.Scanner;
public class Lab045 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Select a browser on which you want to opn the app");
        int num  = sc.nextInt();

        switch(num) {
            case 1:
                System.out.println("Chrome");
                break;
            case 2:
                System.out.println("Mozerilla");
                break;
            case 3:
                System.out.println("Firefox");
                break;
            case 4:
                System.out.println("edge");
                break;
            default:
                System.out.println("the application will get opn on "+num);
                break;
        }


        }
    }

