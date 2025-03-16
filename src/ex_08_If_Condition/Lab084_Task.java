package ex_08_If_Condition;

public class Lab084_Task {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        //A -> 10 -> 11
        // B -> 11
        // C -> 12
        // A+B+C -> 34
        // A -> 13
    }
}
