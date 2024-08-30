package ex_07132024;

public class Lab023 {
    public static void main(String[] args) {
        // Relational Operators -> boolean
        //    // >, < >=,<=, == , != ( ! = ) - true or false.
        int age_Pallavi = 24;
        int age_Sayali = 24;
        boolean result = age_Pallavi > age_Sayali;
        boolean result1 = age_Sayali < age_Pallavi;
        boolean result2 = age_Pallavi >= age_Sayali;
        boolean result3 = age_Sayali >= age_Pallavi;
        boolean result4 = age_Sayali != age_Pallavi;
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
