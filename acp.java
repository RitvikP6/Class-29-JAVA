import java.util.*;

public class Main {

    // Recursive function
    static int recursiveMax(int arr[], int n) {
        // Base case
        if (n == 1)
            return arr[0];

        // Find maximum of remaining elements
        int max = recursiveMax(arr, n - 1);

        // Compare last element with maximum
        if (arr[n - 1] > max)
            return arr[n - 1];
        else
            return max;
    }

    // Iterative function
    static int iterativeMax(int arr[], int n) {
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Maximum using recursion = "
                + recursiveMax(arr, n));

        System.out.println("Maximum using iteration = "
                + iterativeMax(arr, n));

        sc.close();
    }
}