import java.util.*;
public class naturalNo {
    public static void main(String[] args) {
        int i, n,a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
        int sum = 0;
        for(i=1;i<=n;i++){
            sum = sum+i;
            System.out.println("The sum is: "+sum);
        }
        //2nd method for adding n natural number 
        int v = (n/2);
        System.out.println( "The sum of natural number :"+v *(n+1));
    }
}
