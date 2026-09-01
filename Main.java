import java.util.*;
public class Main {
    static void findIndices(int[] arr, int x, int i){
        if (i == arr.length) {
            return;
        }
        if (arr[i] == x) {
            System.out.println(i + " ");
        }
        findIndices(arr, x, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i =0; i<n;i++) {
            arr[i] = sc.nextInt();

        }
        System.out.print("Enter X: ");
        int x = sc.nextInt();

        System.out.println("Indices of " + x + " is: ");
        findIndices(arr,x,0);
    }
}