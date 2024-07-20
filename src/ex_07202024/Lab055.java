package ex_07202024;

public class Lab055 {
    public static void main(String[] args) {
        int num=402;
        int num1='u';

        switch(num) {
            case 102, 202, 302:
                System.out.println("All the best");
                break;
            case 402, 502, 602:
                System.out.println("Better luck next time");
                break;
            default:
                System.out.println("Please enter a value");
        }

                switch(num1) {
                    case 'a', 'e', 'i', 'o','u':
                        System.out.println("Is a vowel");
                        break;
                    default:
                        System.out.println("not a vowel");
                        break;
                }
        }
    }

