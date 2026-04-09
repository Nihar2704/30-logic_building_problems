import java.util.Scanner;
public class SecondLastElemInArray {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter length of array:");
        int n = var.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = var.nextInt();
        }
        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;
        for (int elem:arr){
            if(elem>max){
                secondMax = max;
                max = elem;
            }else if (elem < max && elem > secondMax) {
                secondMax = elem;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("No second largest element exists");
        } else {
            System.out.println("The Second Largest Element is " + secondMax);
        }

    }
}
