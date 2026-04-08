import java.util.Scanner;
public class FibonacciSeries {
    static int fibonacci(int n){
        if (n<=1){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter Number of terms:");
        int terms = var.nextInt();
        System.out.print("Fibonacci Series: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
