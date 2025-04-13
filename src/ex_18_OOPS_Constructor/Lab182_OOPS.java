package ex_18_OOPS_Constructor;

public class Lab182_OOPS {
    public static void main(String[] args) {

        Man m = new Man(25,"Kantharao");
        System.out.println(m.age);
        System.out.println(m.name);
        Man m1 = new Man(35,"Ramarao");
        System.out.println(m1.age);
        System.out.println(m1.name);
    }
}
class Man{
    int age;
    String name;


    Man(int age_arg,String name_arg){
        this.age= age_arg;
        this.name=name_arg;
    }
}