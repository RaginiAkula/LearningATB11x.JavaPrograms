package ex_18_OOPS_Constructor;

public class Lab176_Constructor {

    public static void main(String[] args) {
        Baby b1 = new Baby();
        new Baby();
        Baby b2;

    }
}

class Baby{

    void sleep(){

    }

    void eat(){}
    void cry(){}


    Baby(){
        System.out.println("Baby");
    }
}
