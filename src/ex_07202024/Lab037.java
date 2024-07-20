package ex_07202024;

public class Lab037 {
    public static void main(String[] args) {
        boolean a = true;
        a = !a;
        System.out.println(a);
        if(2+2 <= 4){
            System.out.println("Inside the loop");
        }
        //if we make this statement in else then this will execute only when the condition is false
        System.out.println("Outside -> "+a);
        // Understand with debug -> checking the code line by line

    }
}

