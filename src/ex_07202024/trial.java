package ex_07202024;

public class trial {
        public static void main(String[] args) {
            int year = 2017;

            // divisible by 4, not by 100, or divisible by 400
            if((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)){
                System.out.println(year + " is a leap year.");}
    else {
                System.out.println(year + " is not a leap year.");
            }
        }

}
