import java.util.Scanner;
public class DoWhileLoops
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter the term: ");
            int x = sc.nextInt();
            int num = 1;
            do
            {
                //printing first n numbers of natural numbers.
                System.out.print(num + " ");
                num++;
            }while( num <= x);
        }
    }
}
