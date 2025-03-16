package ex_08_If_Condition;

public class Lab081_If_P1 {
    public static void main(String[] args) {
        String voting_age = args[0];
        int a = Integer.parseInt(voting_age);
        if(a>=18){
            System.out.println("eligible for voting");
        } else
        {
            System.out.println("Not eligible for voting");
        }
    }

}
