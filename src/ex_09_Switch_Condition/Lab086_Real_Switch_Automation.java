package ex_09_Switch_Condition;

import java.util.Scanner;

public class Lab086_Real_Switch_Automation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the no. of testcases");
        //int testcase=scanner.nextInt();
        String testcase = scanner.next();
        switch(testcase){
            case "Login" :
            System.out.println("testcase1....");
            System.out.println("testcase2....");
            System.out.println("testcase3.....");
            System.out.println("testcase4....");
            break;

            case "Details" :
                System.out.println("details");
                break;
            case "Validations" :
                System.out.println("Validations");
                break;
            case "Logout"   :
                System.out.println("Logout");
                break;
            default:
                System.out.println("No testcase will be executed");
                break;



        }


    }
}
