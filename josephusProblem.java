import java.util.Scanner;

public class josephusProblem {
    public static int josephus (int k,int n) {
        if(n==1){
            return 0;
        }
        else{
            return(josephus(n-1, k)+ k-1)%n+1;
        }
    }
    public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter the value of n and k : ");
            int n=sc.nextInt();
            int k=sc.nextInt();
        
        int postiion =josephus(n, k) + 1;
        System.out.println("The position of the last survivor is: " + (postiion+1));
        sc.close();
    }
}
