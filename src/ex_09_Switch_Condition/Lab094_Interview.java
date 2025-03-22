package ex_09_Switch_Condition;

public class Lab094_Interview {
    public static void main(String[] args) {
        int num = 006;
        switch(num){
            case 001,002,003:
                System.out.println("Java");
                break;
            case 004,005,006:
                System.out.println("Python");
                break;
            case 007:
                System.out.println("C");
                break;
            default:
                System.out.println("No language");
                break;
        }

    }
}
