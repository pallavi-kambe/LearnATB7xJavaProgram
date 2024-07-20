package ex_07202024;

public class Lab056 {
    public static void main(String[] args) {
        //lambda expression
        int itemCode = 001;

        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!");
            case 002 -> System.out.println("It's a desktop!");
            case 003, 004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Helo!");
        }

    }
}

