import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = var.nextInt();
        int temp = num;
        int reverseDigit = 0;
        while (temp!=0){
        int id = temp % 10;
        reverseDigit = reverseDigit * 10 +id;
        temp = temp / 10;
        }
        System.out.println(reverseDigit);
    }
}
