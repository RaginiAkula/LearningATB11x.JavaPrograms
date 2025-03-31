package ex_16_Arrays;

public class lab163_2D_Array_Iterate_For_Loop {
    public static void main(String[] args) {
        int[][] matrix ={{3,2,1},{4,3,2},{5,3,2},{3,4,6}};
        //3 2 1
        //4 3 2
        //5 3 2
        //3 4 6
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
