import java.util.Scanner;
public class ForLoops
{
    
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter the term: ");
            int x = sc.nextInt();
            for(int num = 1; num <= x; num++)
            {
                //printing first n numbers of natural numbers.
                System.out.print(num + " ");
            }
        }
    }
}
