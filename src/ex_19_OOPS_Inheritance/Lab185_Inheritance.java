package ex_19_OOPS_Inheritance;

public class Lab185_Inheritance {

    public static void main(String[] args) {

        Father f = new Father();
        f.bhk2();
        Son s = new Son();
        s.bhk2();
        s.bhk3();
        System.out.println(s.gold_f);

    }
}
class Father{
    int gold_f = 1000; // Attribute | Data variables |  Property | Instance Variables

    void bhk2() { //  Behaviour |  Method | Function | Data members
        System.out.println("Father - 2BHK");
    }
}
class Son extends Father{

    //    int gold_f = 1000; // Attribute | Data variables |  Property | Instance Variables
//
//    void bhk2() { //  Behaviour |  Method | Function | Data members
//        System.out.println("Father - 2BHK");
//    }


    void bhk3() {
        System.out.println("3BHK Son");
    }
}