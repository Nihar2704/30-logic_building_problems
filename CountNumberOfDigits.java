import java.util.Scanner;
public class CountNumberOfDigits {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter a Digit");
        int digit = var.nextInt();
        int temp = digit;
        int count = 0;
        while(temp>0){
            temp/=10;
            count++;
        }
        System.out.println("The Total Count of Digits: "+ count);
    }
}
