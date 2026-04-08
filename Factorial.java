import java.util.Scanner;
public class Factorial {
    static int factorial(int n){
        if(n<1){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = var.nextInt();
        System.out.println(factorial(num));
    }
}
