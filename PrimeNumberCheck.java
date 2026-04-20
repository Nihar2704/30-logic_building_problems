import java.util.Scanner;
public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter a Number To Check:");
        int n = var.nextInt();
        boolean isPrime  = true;
        if(n<1) {
            System.out.println("Enter a Number Greater than 1");
            return;
        }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

        if(isPrime){
            System.out.println("It is a Prime Number");
        }else{
            System.out.println("It is Not a Prime Number");
        }

    }
}
