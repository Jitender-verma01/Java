import java.util.*;
class age
{
    public static void main(String[] args) 
    {
     int age;
     Scanner r= new Scanner(System.in);
     System.out.println("Enter your age:");
     age=r.nextInt();
     if (age >=18)
     {
        System.out.println("You Can Vote");
        System.out.println("Thankyou");
     }  
      else
     {
        System.out.println("You are not eligible to vote");
     } 
     return ;
    }
    
}