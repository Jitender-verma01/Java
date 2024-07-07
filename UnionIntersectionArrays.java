import java.util.HashSet;
import java.util.Set;

public class UnionIntersectionArrays {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {4, 5, 6, 7, 8};

        Set<Integer> unionSet = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();

        // Find union
        for (int num : arr1) {
            unionSet.add(num);
        }
        for (int num : arr2) {
            unionSet.add(num);
        }

        // Find intersection
        for (int num : arr1) {
            if (isPresent(arr2, num)) {
                intersectionSet.add(num);
            }
        }

        // Print union
        System.out.println("Union of the two arrays is:");
        for (int num : unionSet) {
            System.out.print(num + " ");
        }

        System.out.println();

        // Print intersection
        System.out.println("Intersection of the two arrays is:");
        for (int num : intersectionSet) {
            System.out.print(num + " ");
        }
    }

    public static boolean isPresent(int[] arr, int num) {
        for (int i : arr) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }
}
