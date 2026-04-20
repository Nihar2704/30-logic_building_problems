import java.util.Scanner;
public class FrequencyCount {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = var.nextInt();
        int [] arr = new int[n];
        boolean[] visited = new boolean[arr.length];
        System.out.println("Enter the elements:");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = var.nextInt();
        }
        for (int i = 0; i <arr.length; i++) {
            if(visited[i]){
                continue;
            }
            int count = 1;
            for (int j = i+1; j <arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i]+" -> "+count);
        }

    }
}
