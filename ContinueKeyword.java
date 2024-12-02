//print all values between 1 to 50 except 3's multiples.
public class ContinueKeyword
{
    public static void main(String[] args)
    {
        for(int num = 1; num <= 50; num++)
        {
            if(num % 3 == 0)
            {
                continue;
            }
            System.out.print(num + " ");
        }
    }
}
