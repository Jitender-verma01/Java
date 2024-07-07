import java.util.Arrays;
import java.util.Scanner;

public class sortAndReversearr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        Arrays.sort(arr);

        System.out.println("\nSorted array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        reverseArray(arr);

        System.out.println("\nReversed array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        sc.close();
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
