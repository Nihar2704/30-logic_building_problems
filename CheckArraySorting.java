import java.util.Scanner;
public class CheckArraySorting {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = var.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = var.nextInt();
        }
        boolean isSorted = true;
        for (int i = 0; i <arr.length -1 ; i++) {
            if(arr[i]>arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is Sorted");
        }else{
            System.out.println("Array is not Sorted");
        }

    }
}
