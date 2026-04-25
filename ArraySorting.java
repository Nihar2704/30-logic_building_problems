import java.util.Scanner;

public class ArraySorting {
    static void sortElement(int[]arr){
        int temp = 0;
        for (int i = 0; i <arr.length - 1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = var.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter elements of array:");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = var.nextInt();
        }
        sortElement(arr);
        System.out.println("Array after Sorting:");
        for (int elem:arr){
            System.out.println(elem);
        }
    }
}
