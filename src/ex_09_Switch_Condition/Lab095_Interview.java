package ex_09_Switch_Condition;

public class Lab095_Interview {
    public static void main(String[] args) {
        int a = 10;
        switch(-1){
            case -11:
            System.out.println("Negative value");
            break;
            case -1:
                System.out.println("Positive value");
                break;
            case 1:
                System.out.println("one");
                break;
            default:
                System.out.println("not matching");
                break;
        }
    }
}
