package ex_07212024;

public class Lab077 {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            if(i%2==0){
                System.out.println("Even number "+i);
                continue;
            }
            System.out.println(i);
        }
    }
}
