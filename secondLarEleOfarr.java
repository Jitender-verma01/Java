
public class secondLarEleOfarr {
    public static void main(String[] args) {
        int arr[] = {5, 8, 3, 4, 6, 7, 9};
        
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements");
            return;
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element in the array");
        } else {
            System.out.println("The second largest number in the array is: " + secondLargest);
        }
    }
}
