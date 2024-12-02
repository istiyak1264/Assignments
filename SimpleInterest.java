import java.util.Scanner;

class SimpleInterest
{
    public static void main(String[] args)
    {
        try(Scanner input = new Scanner(System.in))
        {
            float P, R, T, SI;
            System.out.print("Enter the Principal: ");
            P = input.nextFloat();
            System.out.print("Enter the Rate of Interest: ");
            R = input.nextFloat();
            System.out.print("Enter the Time period: ");
            T = input.nextFloat();

            SI = (P*R*T) / 100;

            System.out.print("Simple Interest is: " + SI);


        }
    }
}
