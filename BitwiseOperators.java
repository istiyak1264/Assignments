public class BitwiseOperators
{
    public static void main(String[] args)
    {
        int a = 9, b = 10;
        System.out.print("9 | 10 equals  : " + (a | b));//11
        System.out.print("\n");
        System.out.print("9 & 10 equals  : " + (a & b));//8
        System.out.print("\n");
        System.out.print("9 ^ 10 equals  : " + (a ^ b));//3
        System.out.print("\n");

        System.out.print("9 << 1 equals  : " + (a << 1));//18
        System.out.print("\n");
        System.out.print("9 << 2 equals  : " + (a << 2));//36
        System.out.print("\n");

        System.out.print("10 >> 1 equals : " + (b >> 1));//5
        System.out.print("\n");
        System.out.print("10 >> 2 equals : " + (b >> 2));//2
    }
}
