import java.util.*;
public class graterNo {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value a, b & c :");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b&&a>c){
            System.out.println("a is the largest number");
        }
        if(b>c&&b>a){
            System.out.println("b is the largest number");
        }
        else
        System.out.println("C is the lartgest number");

    }
}
