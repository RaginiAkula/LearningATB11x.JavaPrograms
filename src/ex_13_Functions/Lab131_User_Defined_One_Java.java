package ex_13_Functions;

public class Lab131_User_Defined_One_Java {
    public static void main(String[] args) {

        int r1= sum_of_two_numbers(13,14);
        int r2= sum_of_two_numbers(3,4);
        System.out.println(r1);
        System.out.println(r2);
    }
    static int sum_of_two_numbers(int a, int b){
        System.out.println("Sum of two numbers");
        return a+b;
    }
}
