import java.util.Scanner;

public class VowelsAndConsonantCount {
    static int checkCount(String str){
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i <str.length() ; i++) {
            char elem = str.charAt(i);
            if(elem =='a' || elem =='e' || elem == 'i' || elem=='o' || elem=='u'){
                count++;
            }
        }
         return count;
    }
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = var.next();
        int result = checkCount(str);
        System.out.println("The Total Number of Vowels: "+result );
        System.out.println("The Total Number of Consonants: "+ (str.length()-result));
    }
}
