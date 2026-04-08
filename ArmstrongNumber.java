import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);

        System.out.println("Enter a Number");
        int num = var.nextInt();

        int temp = num;
        int original = num;
        int count = 0;


        while (temp > 0) {
            temp /= 10;
            count++;
        }

        temp = num;
        double armstrongNumber = 0;


        while (temp != 0) {
            int digit = temp % 10;
            armstrongNumber += Math.pow(digit, count);
            temp /= 10;
        }


        if (original == armstrongNumber) {
            System.out.println("It is an Armstrong Number");
        } else {
            System.out.println("It is not an Armstrong Number");
        }
    }
}