package ex_07_Increment_Decrement_Op;

public class Lab073_ID {
    public static void main(String[] args) {
        int a =10;
        int result = a++;
        System.out.println(a);
        System.out.println(result);

        // Line No. |   a | Exp(result)
        // 5 | 10| NA
        // 6| 11| 11
        // 7| 11 | 11
        // 8| 11 |10
    }
}
