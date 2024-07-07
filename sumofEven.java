import java.util.Scanner;

public class sumofEven {
    public static void main(String[] args) {
        int num, sum = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of num: ");
        num = sc.nextInt();
        
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        
        System.out.println("The sum of even numbers up to " + num + " is " + sum);
    }
}
