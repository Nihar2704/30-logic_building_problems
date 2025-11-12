import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter Digits:");
        int inputDigits = var.nextInt();
        int temp = inputDigits; // storing the input digits in a temporary variable
        int sum = 0;
        int count = 0;
        while(temp!=0){
            temp/=10;
            count++;
        }
        temp = inputDigits;
        while(temp!=0){
            int digits = temp % 10; // extracting the last digit
            sum = sum + (int)Math.pow(digits,count); // calculating the sum of digits raised to power of count
            temp/=10; // removing the last digit

        }
        if(sum==inputDigits){
            System.out.println("It is an Armstrong Number");
        }else{
            System.out.println("It is not an Armstrong Number");
        }

    }
}
