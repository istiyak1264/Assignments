import java.util.Scanner;
class sum_of_two_numbers
{
    public static void main(String[] args)
    {
        try(Scanner input = new Scanner(System.in))
        {
            int num1, num2;
            System.out.print("Enter number 1: ");
            num1 = input.nextInt();
            System.out.print("Enter number 2: ");
            num2 = input.nextInt(); 
            System.out.print("Sum of the numbers: " + (num1+num2));
        }
    }
}
