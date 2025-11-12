import java.util.Scanner;

public class FibonacciSeries {

    static void printFibonacciSeries(int firstTerm, int secondTerm, int term){

        if(term >= 1)
            System.out.println(firstTerm);

        if(term >= 2)
            System.out.println(secondTerm);

        for (int i = 3; i <= term; i++) {   // Loop starts from 3rd term
            int nextTerm = firstTerm + secondTerm;
            System.out.println(nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int n = var.nextInt();
        System.out.println("Fibonacci series upto " + n + " terms:");
        printFibonacciSeries(0, 1, n);
    }
}
