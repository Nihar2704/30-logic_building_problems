
import java.util.Scanner;
    public class SumOfDigits {
        public static void main(String[] args) {
            Scanner var = new Scanner(System.in);
            //taking input using Scanner var
            System.out.println("Enter a number:");
            long num = var.nextLong();
            int length = String.valueOf(Math.abs(num)).length();  //Convert the number to a string (after making it positive) and find how many digits it has

            long sum = 0;

            while(num>0) {
                long digits = num % 10; // using modulus operator remainder of num divided by 10  is stored in digits
                sum += digits;      // getting the total sum of digits
                num /= 10;          // Removing the last digit by dividing num with 10
            }



            System.out.println("The sum of digits is: "+sum);

        }
    }


