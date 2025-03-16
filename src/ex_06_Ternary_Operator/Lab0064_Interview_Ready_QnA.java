package ex_06_Ternary_Operator;

public class Lab0064_Interview_Ready_QnA {
    public static void main(String[] args) {
        int number = 25;
        String result = (number > 10) ? (number > 20 ? "N>20" : "N<20") : "B";
        System.out.println(result);

        int num = 45;
        String res = (num>50) ? (num>100 ? "n>100" : "n<100") : "B" ;
        System.out.println(res);
    }
}
