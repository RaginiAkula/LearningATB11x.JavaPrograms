package ex_16_Arrays;

public class Lab154_Arrays_Max_Min {
    public static void main(String[] args) {
        int marks[] = {32, 46,68,79,21,96};
        /*int max=marks[0];

        for(int i=0;i<marks.length;i++){
          if(marks[i]>max){
              max = marks[i];
          }
        }

        System.out.println(max);

        int min=marks[0];

        for(int i=0;i<marks.length;i++){
            if(marks[i]<min){
                min = marks[i];
            }
        }

        System.out.println(min);*/

        int max_output = give_me_max(marks);
        int min_output = give_me_min(marks);
        System.out.println(max_output);
        System.out.println(min_output);
    }

    private static int give_me_min(int[] marks) {
        int min = marks[0];
        for(int i=0;i<marks.length;i++){
            if(marks[i]<min){
                min = marks[i];
            }
        }
         return min;
    }

    private static int give_me_max(int[] marks) {
        int max = marks[0];
        for(int i=0;i<marks.length;i++){
            if(marks[i]>max){
                max = marks[i];
            }
        }
        return max;
    }
}
