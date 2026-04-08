import java.util.Scanner;
public class LargestInThree {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter Three numbers: ");
        int num1 = var.nextInt();
        int num2 = var.nextInt();
        int num3 = var.nextInt();
        if(num1>=num2 && num1 >= num3){
            System.out.println(num1+" is the largest");
        }
        else if(num2>=num1 && num2>=num3){
            System.out.println(num2+" is the largest");
        }else{
            System.out.println(num3+" is the largest");
        }


  }
}

