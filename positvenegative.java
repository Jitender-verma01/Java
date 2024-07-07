import java.util.Scanner;

public class positvenegative {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        num=sc.nextInt();
        
        if(num>0)
        {
            System.out.println(num +" is the positive number");
        }
        else if( num<0)
        {
            System.out.println(num + " is the negative number");
        }
        else{
            System.out.println(num + " is the zero number");
        }

    }
}
