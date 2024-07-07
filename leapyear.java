
import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year checked leap year or not :");
        year=sc.nextInt();
        
        if(year%4 == 0 && year%100 != 0 || year%400 == 0)
        {
            System.out.println(year + "is the leap year .");
        }
        else
        {
            System.out.println(year + "Not a leap year");
        }

    }
}

