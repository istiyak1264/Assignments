import java.util.Scanner;
class PerfectNumber
{
    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in))
        {
            System.out.print("How many perfect numbers do you want: ");
            int n = input.nextInt();
            int j = 1, count = 0;

            while (true)
            {
                int sum = 0;
                for (int i = 1; i <= j / 2; i++)
                {
                    if (j % i == 0)
                    {
                        sum += i;
                    }
                }
                if (sum == j)
                {
                    System.out.print(j + "  ");
                    count++;
                }
                if (count == n)
                {
                    break;
                }
                j++;
            }
        }
    }
}
