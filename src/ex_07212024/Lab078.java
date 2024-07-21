package ex_07212024;

public class Lab078 {
    public static void main(String[] args) {
        for(int i=0;i<=100;i++){
             if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("FIZZ");
            }
            else if(i%5==0){
                System.out.println("BUZZ");
            }

            else{
                System.out.println(i);
            }
        }
    }
}
