package ex_08_If_Condition;

import java.util.Scanner;

public class Lab082_If_P2 {
        // Allowed to vote or not
        // If age > 18 -> allowed to vote.
        // else age < >18 -> Not allowed to vote.

        public static void main(String[] args) {
            // How to take the user Input
            // 1. CLI Options
            //
            String voting_age = args[0];
       int age = Integer.parseInt(voting_age);

            // 2. Scanner Class
           /** Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your age!");
            int age = scanner.nextInt();
            System.out.println(age);**/


            if (age > 18) {
                System.out.println("Allowed to vote!");
            } else {
                System.out.println("Not Allowed!");
            }


        }
}
