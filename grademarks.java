import java.util.Scanner;

public class grademarks {
    public static void main(String[] args) {
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks :");
        marks=sc.nextInt();

        if(marks >=90)
        {
            System.out.println("Excellent ");
        }
        
        else if(marks >=80)
        {
            System.out.println("Grade A");
        }
        else if (marks>=60) {
            System.out.println("Grade B");
        }
        else if (marks>=40) {
            System.out.println("Grade C");
        }
        else
        {
            System.out.println("Pass");
        }

    }
}

