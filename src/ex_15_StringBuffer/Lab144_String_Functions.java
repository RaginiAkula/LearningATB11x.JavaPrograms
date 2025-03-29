package ex_15_StringBuffer;

public class Lab144_String_Functions {
    public static void main(String[] args) {
        String s1= "Ragini";
        System.out.println(s1.length());
        System.out.println(s1.charAt(3));
        //System.out.println(s1.charAt(10));

        //compare
        System.out.println(s1.equals("Ragini"));
        System.out.println(s1.equalsIgnoreCase("ragini"));

        //contains

        System.out.println(s1.contains("yes"));

        //index of
        System.out.println(s1.indexOf('R','i'));
        //Split
         String s2 = "akula@ragini@123.com";
         String[] split = s2.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        //Trim

        String s3 = " Krishnaveni";
        System.out.println(s3.trim());

        //replace

        String s4 = "Narasamma";
        System.out.println(s4.replace('s','y'));

        //Substring

        String name = "RaviShankar";
        System.out.println(name.substring(3,5));

        //compare to

        String n = "Ramya";
        System.out.println(n.compareTo("ragini"));

        //String BUilder

        StringBuilder stringbuilder =  new StringBuilder("Ragini");
        System.out.println(stringbuilder);

        StringBuilder sb=  new StringBuilder("Hello");
        System.out.println(sb.toString());

        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);

        String s5= "Ragini";
        String s6 = s5.concat("Krishnaveni");
        System.out.println(s6);

        //Concatenation

        String n1 =" Hello";
        String n2 = "World";
        String n3 = "Ji";

        String n4 = n1 + n2+ n3;
        System.out.println(n4);

        String n5 = "PramodduTTA";
        System.out.println(n5.indexOf("d"));
        System.out.println(n5.lastIndexOf("d"));
        System.out.println(n5.lastIndexOf("A"));









    }
}
