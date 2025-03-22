package ex_09_Switch_Condition;

import java.util.Scanner;

public class Lab087_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of days from 1 to 7");// input is 3 , nothing will be printed
        int day = scanner.nextInt();
        switch (day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
        }
    }
}
