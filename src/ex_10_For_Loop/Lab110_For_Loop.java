package ex_10_For_Loop;

public class Lab110_For_Loop {
    public static void main(String[] args) {
        for (int i=0; i<60;i++){
            if( i%2==0){
                System.out.println("Even number" + i);
            }else {
                System.out.println("Odd number" + i);
            }
        }
    }
}
