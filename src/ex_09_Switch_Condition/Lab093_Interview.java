package ex_09_Switch_Condition;

public class Lab093_Interview {
    public static void main(String[] args) {
        //int JDK>13
        int itemcode = 010;
        switch(itemcode){
            case 001: System.out.println("001"); break;
            case 002: System.out.println("002"); break;
            case 003: System.out.println("003");break;
            case 010: System.out.println("010"); break;
            default: System.out.println("default"); break;
        }
    }
}
