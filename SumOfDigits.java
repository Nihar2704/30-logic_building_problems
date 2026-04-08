import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner var =  new Scanner(System.in);
        System.out.println("Enter a digit");
        int inputDigit = var.nextInt();
        int temp = inputDigit;
        int totalSum = 0;
        while(temp!=0){
            totalSum = totalSum + (temp % 10);
            temp = temp / 10;
        }
        System.out.println(totalSum);

    }
}
