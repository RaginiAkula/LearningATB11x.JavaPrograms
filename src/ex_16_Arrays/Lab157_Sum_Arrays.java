package ex_16_Arrays;

public class Lab157_Sum_Arrays {
    public static void main(String[] args) {
        int[] marks ={ 34, 32, 21};
        int sum=0;
        for(int i=0;i<marks.length;i++){
            sum = sum + marks[i];
        }

        System.out.println(sum);
    }
}
