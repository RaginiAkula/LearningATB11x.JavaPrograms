package MethodOverloading;

public class Lab188_Poly_MethodOverloading {

    public static void main(String[] args) {

        MathOperations a = new MathOperations();
        int r1= a.add(3,4);
        double r2 = a.add(45.43d,64.32d);
        String r3= a.add("Ragini","Yesayya");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);;

    }
}

class MathOperations {


    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b){
        return a + b;
    }


}



