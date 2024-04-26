import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        int a,b,result;
        Scanner r= new Scanner(System.in);
        System.out.println("Enter the value of a & b :");
        a=r.nextInt();
        b=r.nextInt();
        System.out.println("Enter the opertor from *,+,-,/,%");
        char opertor=r.next().charAt(0);
        switch (opertor) {
            case '+':
            result=a+b;
            break;
            case '-':
            result=a-b;
            break;
            case '*':
            result=a*b;
            break;
            case '/':
            result=a/b;
            break;
            case '%':
            result=a%b;
            break;
            default:
            System.out.println("Enter the correct opeartor");
                return;
        }
        System.out.print( a+" "+opertor+" "+b+" ="+result);
    }
}
