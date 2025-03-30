package ex_15_StringBuffer;

public class Lab148_SB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World");
        sb.reverse();
        System.out.println(sb);
    }
}
