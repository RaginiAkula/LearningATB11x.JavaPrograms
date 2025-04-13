package ex_18_OOPS_Constructor;

public class Lab181_PC_Real {
    public static void main(String[] args) {

        person p= new person();
        person p1=new person("Ramya",9948637932l,"Main road");
        System.out.println(p1.name);
        person p2= new person("Lasya",9182088504l,"Gandhi road");
        System.out.println(p2.phone);

        person p3=new person();
        p3.address="Lane road";
        System.out.println(p3.address);
    }
}
class person{
    String name;
    long phone;
    String address;

    person(){

    }

    person(String name_rc_arg,long phone_rc_arg, String address_rc_arg){
        this.name=name_rc_arg;
        this.phone=phone_rc_arg;
        this.address=address_rc_arg;
    }

    person(String name_rc_arg,long phone_rc_arg){
        this.name=name_rc_arg;
        this.phone=phone_rc_arg;
    }

    void eating(){
        System.out.println("eating");
    }
}
