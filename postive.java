import java.util.*;
public class postive {
    public static void main(String args[]) {
      int num;
      Scanner pos=new Scanner(System.in) ;
      System.out.print("Enter a number :");
      num=pos.nextInt();
      if(num>=0)
      {
        System.out.println("Your no. is postive");
      } 
      else{
        System.out.println("Your number is negative");
      }
    }
    
}
