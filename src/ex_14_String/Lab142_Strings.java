package ex_14_String;

public class Lab142_Strings {
    public static void main(String[] args) {
        String s1= "Hello";
        String s2= "Hello";
        String s3 = new String("Hello");
        String s4 = new String("hello");
        System.out.println(s1==s3);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s4));

    }
}
