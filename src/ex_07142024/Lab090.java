package ex_07142024;

public class Lab090 {
    public static void main(String[] args) {
        //Type casting
        //Explicit type casting
        //Implicit type casting

       //1. Implicit type casting: Is done directly by JVM when smaller container value is putted
        // in bigger container. Eg--
        byte b=10;
        int c=b;// here as byte is small container we can store value in int as it is large
                            //container
                // Implicit typecasting does not have data loss

        //2. Explicit type casting: is done by human's explicitily when we want to store the large
                //amount of data into the small container. Eg--

        float f=10.444f;
        int i=(int)f;// Op is 10 but the .444 will not get stored in I as we are storing the large amount in small container
                        //So Explicit typecasting is loss of data
        System.out.println(i);


    }
}
