
import java.util.Scanner;

public class addTwoMatrix{
    public static void main(String[] args) {
        int[][] a = new int[4][4];
        int[][] b = new int[4][4];
        int[][] sum = new int[4][4];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the elements of the first 4x4 matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the elements of the second 4x4 matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("The sum of the two matrices is:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
