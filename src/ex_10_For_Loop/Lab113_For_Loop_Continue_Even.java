package ex_10_For_Loop;

public class Lab113_For_Loop_Continue_Even {
    public static void main(String[] args) {
        for( int i=1;i<=60;i++){
            if(i%2==0){
                System.out.println("even number ->" + i);
                continue; // use break also
            }
            System.out.println("Odd number -> " + i);
        }
    }
}
