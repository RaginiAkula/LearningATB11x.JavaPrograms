package Tasks;

import java.util.Scanner;

public class Lab001_Task_Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the input string");
        String string = input.next();
        String newString = reverseString(string);
        if (string.equalsIgnoreCase(newString)) {
            System.out.println("given input is a palindrome");
        } else {
            System.out.println("given input is not a palindrome");
        }

    }

    private static String reverseString(String string) {
        String reverse = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            reverse = reverse + string.charAt(i);
        }
        return reverse;

    }

    private static String reverseStringSB(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        return stringBuilder.reverse().toString();
    }

}

