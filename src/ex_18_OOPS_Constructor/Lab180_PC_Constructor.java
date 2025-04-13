package ex_18_OOPS_Constructor;

public class Lab180_PC_Constructor {
    public static void main(String[] args) {
      bike b1= new bike();
      bike b2 = new bike();
        System.out.println(b1.cost);
        System.out.println(b1.name);
        System.out.println(b1.charges);

        System.out.println(b2.name);

        bike b3 = new bike(34.5f,"Sivaram",314564l);

        System.out.println(b3.name);

        bike b4 = new bike(23.45f,"Mahindra",3456271l);
        System.out.println(b4.cost);

        bike b5= new bike(32.4f,"Bajaj",345643l);
        System.out.println(b5.name);
    }
}

class bike{

    long cost;
    String name;
    float charges;

    bike(){
        cost= 123456l;
        name="Priyanka";
        charges=1.21f;

        System.out.println("bike details");

    }




    bike(float Charges_oc_arg, String name_oc_arg, long cost_oc_arg) {

        this.name = name_oc_arg;
        this.cost= cost_oc_arg;
        this.charges=Charges_oc_arg;
    }
}