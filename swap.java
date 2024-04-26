import java.util.Scanner;

public class swap{
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value num1:");
        a=sc.nextInt();
        System.out.println("Enter the value of num2:");
        b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println("The value of a:"+a);
        System.out.println("The value b is :" +b);
    }
}