import java.util.Scanner;
public class OddEvenCheck {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        //taking a number as input to check
        System.out.println("Enter a Number:");
        int num = var.nextInt();
        // checking if num is divisible by 2 then it is even and if not then it is odd
        if(num%2==0){
            System.out.println(num+" is an even number");
        }else{
            System.out.println(num+" is an odd number ");
        }
    }
}
