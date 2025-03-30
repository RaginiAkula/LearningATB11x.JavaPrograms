package Tasks;

import java.util.Scanner;

public class Lab003_TriangleClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the angle for side1");
        int side1 = scanner.nextInt();
        System.out.println("Enter the angle for side2");
        int side2 = scanner.nextInt();
        System.out.println("Enter the angle for side3");
        int side3 = scanner.nextInt();

        if(side1+ side2 <= side3 || side2 + side3 <= side1 || side1+side3 <= side2 ){
            System.out.println("This is not a triangle");
            System.exit(0);
        }

        if(side1<=0 || side2<=0 || side3<=0){
            System.out.println("this is not a triangle");
            System.exit(0);
        }

        if(side1==side2 && side2==side3){
            System.out.println("Right angle triangle");
        } else if(side1==side2 || side2==side3 || side3==side1){
            System.out.println("Isoceless triangle");
        } else{
            System.out.println("Scalene");
        }
        scanner.close();
    }
}
