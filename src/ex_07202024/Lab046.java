package ex_07202024;
import java.util.Scanner;
public class Lab046 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Select a browser");
        String browser = sc.next();
        browser = browser.toLowerCase();

        switch(browser) {
            case "chrome":
                System.out.println("opeaning chrome browser");
                break;
            case "edge":
                System.out.println("Opeaning edge browser");
                break;
            case "firefox":
                System.out.println("Opeaning firefox browser");
                break;
            default:
                System.out.println("Please select a browser");
                break;
        }
        }
    }

