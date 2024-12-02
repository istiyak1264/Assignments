import java.util.Scanner;
public class EvenOdd
{
    public static void main(String[] args)
    {
        try(Scanner input = new Scanner(System.in))
        {
            int x;
            System.out.print("Enter the number: ");
            x = input.nextInt();
            if(x == 0 )
            {
                System.out.print("Entered number is 0.");
            }
            else if(x % 2 == 1)
            {
                System.out.print(x + " is an Odd number.");
            }
            else
            {
                System.out.print(x + " is an Even number.");
            }

        }
    }
}
