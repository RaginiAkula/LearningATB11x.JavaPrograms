package ex_09_Switch_Condition;

public class Lab085_Switch_Without_Break {

    public static void main(String[] args) {
        String browser = args[0];
        int browser_1 = Integer.parseInt(browser);

        switch(browser_1){

            case 1:
                System.out.println("Chrome");

            case 2:
                System.out.println("internet explorer");

            case 3:
                System.out.println("Firefox");

            case 4:
                System.out.println("Opera");

            default:
                System.out.println("NO browser will be executed");

        }
    }
}
