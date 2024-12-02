import java.util.Scanner;
public class GCD
{
    public static int gcd(int a, int b)
    {
        if (b == 0)
        {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args)
    {
        try(Scanner scanner = new Scanner(System.in))
        {
            System.out.print("Enter a: ");
            int a = scanner.nextInt();
            System.out.print("Enter b: ");
            int b = scanner.nextInt();
            System.out.print("GCD of a and b: " + gcd(a, b));
        }
        
    }
}
