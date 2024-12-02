import java.util.Scanner;
public class whileLoops
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter the term: ");
            int x = sc.nextInt();
            int num = 1;
            while( num <= x)
            {
                //printing first n numbers of natural numbers.
                System.out.print(num + " ");
                num++;
            }
        }
    }
    
}
