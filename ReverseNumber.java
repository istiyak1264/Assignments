
import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args)
    {
        try(Scanner input = new Scanner(System.in))
        {
            int x, reverse = 0;
            System.out.print("Enter a number: ");
            x = input.nextInt();
            while(x > 0)
            {
                reverse *= 10;
                reverse = reverse + (x % 10);
                x /= 10;
            }
            System.out.print("Reverse number is: " + reverse);
        }
    }
}
