package Tasks;

public class Lab006_Odd_Even {
    public static void main(String[] args) {
        int[] marks = {56,45,34,23,21};

        for(int i=0; i<marks.length;i++){
            if(marks[i]%2==0) {
                System.out.println("even numbers:" + marks[i]);
            }
                else{
                    System.out.println("odd numbers:" + marks[i]);
                }
            }
        }
    }

