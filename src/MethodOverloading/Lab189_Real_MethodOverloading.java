package MethodOverloading;

public class Lab189_Real_MethodOverloading {
    public static void main(String[] args) {
        home h = new home();
        int r = h.add(3,6);
        int g = h.add(3,4,5);
        System.out.println(r);
        System.out.println(g);
    }
}

class home{

    void add(){

    }

    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }
}
