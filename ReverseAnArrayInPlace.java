import java.util.Scanner;

public class ReverseAnArrayInPlace {
    public static void main(String[] args) {

        Scanner var = new Scanner(System.in);

        System.out.println("Enter the length of array:");
        int n = var.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = var.nextInt();
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        for (int elem : arr) {
            System.out.println(elem);
        }
    }
}