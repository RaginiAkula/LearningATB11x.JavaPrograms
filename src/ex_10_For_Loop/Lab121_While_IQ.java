package ex_10_For_Loop;

import java.util.Scanner;

public class Lab121_While_IQ {
    public static void main(String[] args) {
        //Factorial Program
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Program\nEnter the no whose factorial you want!");
        int number = scanner.nextInt();

        int factorial =1;
        if(number<=0){
            System.out.println(factorial);
        }else {
            for (int i = 1; i <= number; i++) {
                factorial = factorial * i;
            }

        }
        System.out.println("factorial ->" + factorial);




    }

}
