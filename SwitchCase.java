
import java.util.Scanner;
public class SwitchCase
{
    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in))
        {
            int day;
            System.out.print("Enter the day number: ");
            day = input.nextInt();
            switch (day)
            {
                case 1:
                    System.out.print("The day is Saturday.");
                    break;
                case 2:
                    System.out.print("The day is Sunday.");
                    break;
                case 3:
                    System.out.print("The day is Monday.");
                    break;
                case 4:
                    System.out.print("The day is Tuesday.");
                    break;
                case 5:
                    System.out.print("The day is Wednesday.");
                    break;
                case 6:
                    System.out.print("The day is Thursday.");
                    break;
                case 7:
                    System.out.print("The day is Friday.");
                    break;
                default:
                    System.out.print("Invalid Day number.");
            }
        }
    }
}

