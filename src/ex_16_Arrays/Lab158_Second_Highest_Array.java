package ex_16_Arrays;

import java.util.Arrays;

public class Lab158_Second_Highest_Array {
    public static void main(String[] args) {
        int[] marks = {67,45,94,65,34};

        Arrays.sort(marks);
        System.out.println(marks[marks.length-2]);
        System.out.println(marks[marks.length-3]);
    }
}
