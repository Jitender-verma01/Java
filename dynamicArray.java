import java.util.*;
public class dynamicArray {
    public static void main(String[] args) {
        int size ,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size ");
        size=sc.nextInt();
        int a[]=new int [size];
        for(i=0;i<size;i++)
        {
            System.out.println(a[i]);
        }
    }
}