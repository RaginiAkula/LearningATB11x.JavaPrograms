package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {


        int result = f2();
        System.out.println(result);

        float r =f3();
        System.out.println(r);
    }
    static void f1(){
        System.out.println("result f1");
    }
    static int f2(){
        System.out.println("integer");
        return 10;
    }
    static float f3(){
        System.out.println("float value");
        return 3.14f;
    }
    static boolean f4(){
        System.out.println("boolean");
        return true;
    }

}
