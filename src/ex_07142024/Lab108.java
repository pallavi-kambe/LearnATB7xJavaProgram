package ex_07142024;

public class Lab108 {
    public static void main(String[] args) {
        String s1 = new String("Pramod");
        String s2 = new String("Pramod");
        //  2, Heap area
        String s3  = s1; // (This doesn't mean this in the SCP) - S3 -> S1 (heap area)
        //  2, heap  s3 -> s1 -> Pramod
        System.out.println(s1);
        System.out.println(s3);
        System.out.println(s1==s2);// checking for location
        System.out.println(s1.equals(s2));// checking for values
        System.out.println(s3==s2);//checking for location
        System.out.println(s3.equals(s1));//checking for values
        System.out.println(s3==s1);//checking for location
    }
}
