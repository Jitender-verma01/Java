import java.util.*;
public class fabnaci {
    public static void main(String[] args) {
        int a=0,b=1,c,n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to calculate fab.");
        n=sc.nextInt();
        for(i=0;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
            //100System.out.println(i+c);
        }
    }
}
