import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num = var.nextInt();
        if(num % 2 ==0){
            System.out.println("The number "+ num+" is even");
        }else{
            System.out.println("The number "+num+" is odd");
        }
    }
}
