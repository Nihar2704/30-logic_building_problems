import java.util.Scanner;
public class MinMaxInArray {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n = var.nextInt();
        int [] arr = new int[n];
        int max = arr[0];

        System.out.println("Enter the elements:");
        for (int i = 0; i <arr.length; i++) {
            arr[i] = var.nextInt();
        }
        int min = arr[0];
        for (int elem:arr){
            if (elem>max){
                max = elem;
            }
            if(elem<min){
                min = elem;
            }
        }
        System.out.println("Maximum Element: "+max );
        System.out.println("Minimum Element: "+min);
    }
}
