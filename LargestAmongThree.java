import java.util.Scanner;

public class LargestAmongThree {
    public static void main(String[] args) {

      Scanner var = new Scanner(System.in);
      //taking input of three numbers
        System.out.println("Enter first number:");
        int a = var.nextInt();
        System.out.println("Enter second number:");
        int b = var.nextInt();
        System.out.println("Enter third number:");
        int c = var.nextInt();
        // Creating logic to find largest among three using if-else and && operator
        if (a>b && a>c){
            System.out.println(a+" is the largest number");
        }else if(b>a && b>c){
            System.out.println(b+" is the largest number");
        }else{
            System.out.println(c+" is the largest number");
        }

    }
}
