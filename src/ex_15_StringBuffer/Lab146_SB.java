package ex_15_StringBuffer;

public class Lab146_SB {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Ragini");
        name.append("Priyanka");
        System.out.println(name);
        System.out.println(name.reverse());

        String n1 = "SivaRam";
        String n2 = "Priyanka";
        String n3 = n1+n2;
        System.out.println(n3);
        System.out.println(n1);


    }
}
