package ex_14_String;

public class Lab141_String_Interview_P2 {

    public static void main(String[] args) {
        String s1= "Hello";//SCP
        String s2= "Hello";// SCP
        String s3= "Hello";//SCP

        String s4 = new String("Hello");//OA
        String s5 = new String("Hello");//OA
        String s6 = new String("hello");//OA

        //Comparison
        System.out.println(s1==s3);
        System.out.println(s2==s6);
        System.out.println(s3==s5);
        System.out.println(s1==s2);

        //equal case

        System.out.println(s1.equals(s5));
        System.out.println(s2.equals(s6));
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s6));

        //
    }
}
