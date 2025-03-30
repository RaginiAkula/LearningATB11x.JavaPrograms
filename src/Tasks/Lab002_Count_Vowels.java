package Tasks;

public class Lab002_Count_Vowels {
    public static void main(String[] args) {

        int vowels = 0;
        int consonants = 0;

        String name = "Java Program to Count Vowels and Consonants";
        name=name.toLowerCase();

        for(int i=0; i<name.length();i++){
            char ch = name.charAt(i);
            if(ch=='a' || ch=='e' || ch== 'i' || ch== 'o' || ch== 'u'){
                vowels = vowels+1;
            } else{
                consonants = consonants+1;
            }
        }
        System.out.println("Number of vowels:" + vowels);
        System.out.println("Number of consonants:" + consonants);
    }
}
