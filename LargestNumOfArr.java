import java.util.Arrays;
import java.util.Scanner;

public class LargestNumOfArr {
    public static void main(String[] args) {
       
          int arr[]={5,8,3,4,6,7,9};
        // int arr[10]={};
        // Scanner sc= new Scanner(System.in);
        // System.out.println("Enter an array : ");
        // arr[]=sc.nextInt();


        Arrays.sort(arr);
        

        int largest =arr[0];
        int smallest =arr[0];
        int secondlargest=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
                  
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        
        System.out.println( "\nThe sorted array is : " + Arrays.toString(arr));
        System.out.println("The largest number of an array is : " +largest);
        System.out.println("The smallest number of an array is : "+ smallest);
        System.out.println("The secondlargest value of an array is : "+secondlargest );
    }
}
