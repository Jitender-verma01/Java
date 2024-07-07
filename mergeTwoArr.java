// public class mergeTwoArr {

//     public static void main(String[] args) {
//         int arr1[] = {1, 2, 3, 4, 5};
//         int arr2[] = {6, 7, 8, 9, 10};
//         int merged[] = new int[arr1.length + arr2.length];

//         // Merging the two arrays
//         System.arraycopy(arr1, 0, merged, 0, arr1.length);
//         System.arraycopy(arr2, 0, merged, arr1.length, arr2.length);

//         System.out.println("The merged array is: ");
//         for (int i : merged) {
//             System.out.print(i + " ");
//         }
//     }
// }

import java.util.Scanner;
// import java.util.Arrays;

public class mergeTwoArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the first array: ");
        int n1 = sc.nextInt();
        int[] array1 = new int[n1];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < n1; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.print("Enter the number of elements in the second array: ");
        int n2 = sc.nextInt();
        int[] array2 = new int[n2];

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < n2; i++) {
            array2[i] = sc.nextInt();
        }

        int[] mergedArray = mergeArrays(array1, array2);

        System.out.println("Merged array:");
        for (int element : mergedArray) {
            System.out.print(element + " ");
        }

        sc.close();
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        int n1 = array1.length;
        int n2 = array2.length;
        int[] mergedArray = new int[n1 + n2];

        System.arraycopy(array1, 0, mergedArray, 0, n1);
        System.arraycopy(array2, 0, mergedArray, n1, n2);

        return mergedArray;
    }
}

