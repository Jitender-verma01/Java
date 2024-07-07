public class duplicatenum {
    static int repeatedNumber(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    
        int arr[] = {1,2,3,4,5,6,7,89,9};
        int result = repeatedNumber(arr);
        if(result != -1) {
            System.out.println("First duplicate number is: " + result);
        } else {
            System.out.println("No duplicate number found.");
        }
    }
}
