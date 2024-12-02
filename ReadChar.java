
import java.util.Scanner;
class ReadChar
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            char ch;
            System.out.print("Enter a string: ");
            ch = sc.nextLine().charAt(2);
            System.out.print("Character at 2nd Index: " + ch);
        }
    }
}
