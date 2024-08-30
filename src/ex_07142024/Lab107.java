package ex_07142024;

public class Lab107 {
    public static void main(String[] args) {
        String s1= "Pallavi";// SCP memory
        String s2= new String("Pallavi");//Heap memory
        String s4= new String("PALLAVI");
        String S1="Kambe";
        String s5="Pallavi";
        String s3=new String("Kambe");
        System.out.println(s1==s2);// Checks for content(data)
        System.out.println(s1.equals(s2));// Checks for location
        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));//heap memory stores all new data in new location
        System.out.println(s2.equalsIgnoreCase(s4));
        System.out.println(s5==s1);

    }
}
