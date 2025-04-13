package MethodOverloading;

public class Calculation {

    public static void main(String[] args) {
        int attribute;
        Calculation c1 = new Calculation();
        c1.add(3,4);
        c1.add(31.12d,43.22d);

    }

    public int add(int a, int b){
        return a+b;
    }

    public double add(double a, double b){
        return a+b;
    }

}

