package MethodOverriding;

public class Lab190_MethodOverriding {
    public static void main(String[] args) {

        MathOperations m = new MathOperations();
        m.add(2,6,8);
    }
}
class Operations {

    int add(int a, int b, int c) {
        System.out.println("addition1 ");
        return a + b+c;
    }
}

    class MathOperations extends Operations{
        @Override
        int add(int a, int b, int c){
            System.out.println("addition1 ");
            return a+b+c;
        }
    }


