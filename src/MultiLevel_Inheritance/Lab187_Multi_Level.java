package MultiLevel_Inheritance;

public class Lab187_Multi_Level {
    public static void main(String[] args) {
        //Son s2 = new GrandFather();
        //Son s3 = new Father();
        Son amit = new Son();
        amit.Father();
        amit.S();
        amit.home();
        System.out.println(amit.gold_gf);
        Father f1 = new Father();
        f1.Father();
        f1.home();
        Son s1= new Son();
        s1.S();
        s1.home();
        GrandFather g1=new GrandFather();
        g1.GF();
        g1.home();
    }
}
