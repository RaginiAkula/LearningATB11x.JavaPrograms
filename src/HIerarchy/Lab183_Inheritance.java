package HIerarchy;

public class Lab183_Inheritance {
    public static void main(String[] args) {

        Father f = new Father();
        Ragini r1 = new Ragini();
        f.home();
        r1.home();

        Priyanka p1= new Priyanka();
        p1.home();

        Sivaram s1= new Sivaram();
        s1.home();
        s1.s();
    }
}
class Father{
    void home(){
        System.out.println("3BHK");
    }
}
class Ragini extends Father{

    void r(){
        System.out.println("r");
    }
}

class Priyanka extends Father{
    void p(){
        System.out.println("p");
    }
}

class Sivaram extends Father{
    void s(){
        System.out.println("s");
    }
}
