package ex_06_Ternary_Operator;

public class Lab067_TO_Three_Max {
    public static void main(String[] args) {
        int i = 12;
        int j = 24;
        int k = -10;
        String max = (i>j) ? (i>k) ? "max value is i": "max value is k" : ((j>k) ? "max value is j"
: "max value is k");
        System.out.println("Max ix" + max);
    }
}
