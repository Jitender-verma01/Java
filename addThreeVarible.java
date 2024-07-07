import java.util.Scanner;

public class addThreeVarible {
    public static void main(String[] args) {
        int a=0,b=1,c,num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value num :");
        num=sc.nextInt();
        for(int i=0;i<=num;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println( "The fab of given num is :" +" " +c);
        }

    }
}
