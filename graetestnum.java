import java.util.Scanner;

public class graetestnum {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a ,b ,c :");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        
        if(a>b)
        {
            if (a>c) {
                System.out.println("a is the greatest number");  
            }
            else{
                System.out.println("c is the largest number");
            }
            
        }
        
        else {
            if (b>c) {
                System.out.println("b is the greatest number");  
            }
        else
        {
            System.out.println("c is the greatest number");
        }
    }

    
    }
}
