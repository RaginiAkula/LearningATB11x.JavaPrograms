package ex_17_OOPS;

public class Lab168_Cats {
    public static void main(String[] args) {

        Cat c1 =new Cat();
        Cat c2;
        new Cat();

        c1.sleep();

        new Cat().sleep();
        System.out.println(new Cat().name);



    }
}

class Cat{

    String name;
    String breed;
    String eyes_colour;
    int legs;
    void sleep(){
        System.out.println("sleeping");
    }
    String colour(String name){
        return "black" +name;
    }

    int legs(int legs, int eyes){
        return eyes;
    }
}
