package ex_18_OOPS_Constructor;

public class Lab179_DC_Constuctor {
    public static void main(String[] args) {
       car c1 = new car();
       car c2= new car();
        System.out.println(c1.name);
        System.out.println(c1.result);
        System.out.println(c1.name);

        System.out.println(c2.name);
        System.out.println(c2.result);
        System.out.println(c2.name);


    }
}
class car{
    String name;
    int result;
    String model;

    car(){
        name = "Ragini";
        result= 20;
        model= "Fibonacci";

    }

}
