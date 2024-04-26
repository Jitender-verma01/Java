import java.util.*;
public class grade {
    public static void main(String[] args) {
        int marks;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks :");
        marks=sc.nextInt();
        if(marks>=80){
            System.out.println("Topper");
        }
        else if(marks<80&&marks>=60){
            System.out.println("First");
        }
        else if(marks>60&&marks>=50){
            System.out.println("Third");
        }
        else if(marks>50&&marks>=38){
            System.out.println("You passed the Exam");
        }
        else
        System.out.println("You are fail");
    }
}
