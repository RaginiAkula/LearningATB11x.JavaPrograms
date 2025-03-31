package ex_16_Arrays;

import java.util.Arrays;

public class Lab153_Arrays_Print2 {
    public static void main(String[] args) {
        int[] marks = {96, 57, 47, 83, 42, 21};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
        Arrays.sort(marks);

        System.out.println("----");
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);

        }
    }
}
