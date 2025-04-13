package MultiLevel_Inheritance;

public class Lab185_Multi_Level {
    public static void main(String[] args) {
        GrandFather g = new GrandFather();
        g.GF();
        g.home();

        Father f = new Father();
        f.GF();
        f.home();
        f.Father();

        Son s1 = new Son();
        s1.S();
        s1.home();
       s1.Father();
       s1.GF();
    }




}
