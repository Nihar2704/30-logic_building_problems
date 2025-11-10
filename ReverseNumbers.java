import java.util.Scanner;
public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter Digits:");
        int num = var.nextInt();
        int reverseDigits = 0;
        while(num!=0){
            int digits = num % 10;  // extract the last digit
             reverseDigits = reverseDigits * 10 + digits; // build the reverse digit
           num/= 10; // removes the last digit
        }
        System.out.println("Reverse of "+num+" is "+reverseDigits);
    }
}
