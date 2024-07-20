package ex_07202024;

public class Lab053 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        if(a>b && a>c)
        {
            System.out.println("a is greater "+a );
        }
        else if(b>a && b>c)
        {
            System.out.println("b is greater "+b);
        }
        else{
            System.out.println("c is greater "+c);
        }

    }
}
