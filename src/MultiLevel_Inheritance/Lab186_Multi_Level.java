package MultiLevel_Inheritance;

public class Lab186_Multi_Level {
    public static void main(String[] args) {
        GrandFather G1 = new Son();
        G1.GF();
        G1.home();

        GrandFather G2 = new Father();
        G2.GF();
        G2.home();

        Father F1 = new Son();
        F1.Father();
        F1.home();

        //Son S1= new Father();//Dynamic Dispatch


    }
}
