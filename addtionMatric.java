import java.util.Scanner;

public class addtionMatric {
    public static void main(String[] args) {
        int a[][],b[][],i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First matrix:");
        for(i=0;i<=2;i++)
        {
            for(j=0;j<=2;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the Second Matrix :");
        for(i=0;i<=2;i++){
            for(j=0;j<=2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Sum is : ");
        int c[][] = 0;
        for(i=0;i<=2;i++){
            for(j=0;j<=2;j++){
                c[i][j]=a[i][j]+b[i][j];
                for(i=0;i<=2;i++){
                    for(j=0;j<=2;j++){

                    }
                }
                System.out.println(c);
            }
        }
        System.out.println(" ");
    }
}
