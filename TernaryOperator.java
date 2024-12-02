import java.util.Scanner;

public class TernaryOperator
{
    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in))
        {
            int x;
            System.out.print("Enter a number: ");
            x = input.nextInt();
            String str;
            str = (x % 2 == 0) ? (x + " is an Even number.") : (x + " is an Even number.");
            System.out.print(str);
            //System.out.print((x % 2 == 0) ? (x + " is an Even number.") : (x + " is an Odd number."));
        }
    }
}
