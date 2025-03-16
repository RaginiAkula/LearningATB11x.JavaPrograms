package ex_06_Ternary_Operator;

public class Lab001_Task_TO {
    public static void main(String[] args) {

        String x = args[0];

        String y = args[1];

        int a = Integer.parseInt(x);
        int b = Integer.parseInt(y);
        //System.out.println(Math.max(a,b));

        String c = (a>b) ? " max value is a" : " max value is b";
        System.out.println(c);
    }
}
