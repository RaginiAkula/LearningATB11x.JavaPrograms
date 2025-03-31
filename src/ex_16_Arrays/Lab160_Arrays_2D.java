package ex_16_Arrays;

public class Lab160_Arrays_2D {
    public static void main(String[] args) {
        int[][] array_2d = {{1,5,6},{2,3,4},{2,1,4}};
        //1 5 6
        //2 3 4
        //2 1 4
        array_2d[0][0]=1;
        array_2d[0][1]=5;
        array_2d[0][2]=6;
        array_2d[1][0]=2;
        array_2d[1][1]=3;
        array_2d[1][2]=4;
        array_2d[2][0]=2;
        array_2d[2][1]=1;
        array_2d[2][2]=4;
        System.out.println(array_2d[2][2]);
        int[][] array;
        array = new int[][] {{10,20},{15,12},{14,10}};
        //10 20
        //15 12
        //14 10
    }
}
