public class BreakStatement
{
    public static void main(String[] args)
    {
        int num = 1;
        while(true)
        {
            if( (num % 5 ==0) && (num % 7 == 0) )
            {
                System.out.println("First number divided by 5 and 7 is: " + num);
                break;
            }
            num++;
        }
    }
}
