import java.util.Scanner;
public class RotateArrayByK {
    static void reverseElem(int [] arr, int left, int right){
        while(left < right){
            int temp = 0;
            temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    static void rotateRight(int [] arr, int k){
        int n = arr.length;
        k = k % n;
        reverseElem(arr,0,n-1);  // It will reverse the whole elements of array
        reverseElem(arr,0,k-1); // It will rotate the first two elements in array
        reverseElem(arr,k,n-1); // It will rotate the rest of the elements
    }

    static void rotateLeft(int [] arr, int k){
        int n = arr.length;
        k = k % n;
        reverseElem(arr,0,k-1);  // It will rotate the first two elements in array
        reverseElem(arr,k,n-1); // It will rotate remaining n-k elements
        reverseElem(arr,0,n-1); // It will reverse all elements of array
    }



    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = var.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = var.nextInt();
        }

        System.out.println("Enter the value of k:");
        int k = var.nextInt();
        rotateLeft(arr,k);
        System.out.println("Array elements after k rotation:");
        for (int elem: arr){
            System.out.println(elem);
        }
    }
}
