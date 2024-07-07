import java.util.Scanner;

public class vowelConsonat {
    public static void main(String[] args) {
        char character;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the char :");
        character = sc.next().charAt(0);

        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
        character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U')  
        {
            System.out.println(character + " is the vowel .");
        }
        else{
            System.out.println(character + " is the consonant");
        }

    }
}
