import java.util.*;
public class Fabonaci {
    public static void main(String[] args) {
        int a=0,b=1,num;
        int c;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of Fab:");
        num=sc.nextInt();
        for(int i=0;i<=num;i++)
        {
        c=a+b;
        a=b;
        b=c;
        System.out.print("The Fab num is :"+c);
        }
    }
}
