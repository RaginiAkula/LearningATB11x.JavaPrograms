package ex_16_Arrays;

public class Lab152_Arrays {
    public static void main(String[] args) {
        String[] names = {"Ragini", "Priyanka","Sivaram","Navya","Mohith","Pawan"};
        String[] names_family = new String[3];
        names_family[0]= "Ragini";
        names_family[1]="Priyanka";
        names_family[2]= "Sivaram";
        System.out.println(names_family[1]);
        boolean[] family_function = {true, false, false, true};
        boolean[] family= new boolean[2];
        family[0]= true;
        family[1]= false;
        System.out.println(family[1]);
    }
}
