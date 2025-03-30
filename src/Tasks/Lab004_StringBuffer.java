package Tasks;

public class Lab004_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("World");
        System.out.println(sb);
        // reverse
        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.charAt(5));


        sb.replace(5,9,"Desha");
        System.out.println(sb);

        StringBuffer sbu = new StringBuffer(" JavaProgramming");
        sbu.trimToSize();
        System.out.println(sbu);
        System.out.println(sbu.length());
        System.out.println(sbu.substring(0,13));
        System.out.println(sbu.delete(4,7));
        System.out.println(sbu.capacity());
        String str = sbu.toString();
        System.out.println(str);
        System.out.println(sbu.indexOf(str));

    }
}
