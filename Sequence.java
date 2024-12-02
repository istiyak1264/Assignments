import java.util.Scanner;

class Sequence {
    public void alternateSignSeq() {
        int sign = -1, n = 4, k = 1;
        System.out.println("The Sequence is:");
        System.out.printf("%d\t%d\t", -(n - 1), n);
        for (int i = 1; i < 10; i++) {
            k *= 2;
            n += k;
            int temp = n * sign;
            System.out.printf("%d\t", temp);
            sign *= -1;
        }
        System.out.println();
    }

    public void repeatSeq() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d\t", i);
            }
            System.out.printf("%n");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int ch;
            Sequence obj = new Sequence();
            do {
                System.out.println("Enter your option:");
                System.out.println("1 ----> Line Sequence");
                System.out.println("2 ----> Triangle Sequence");
                int opt = sc.nextInt();
                switch (opt) {
                    case 1:
                        obj.alternateSignSeq();
                        break;
                    case 2:
                        obj.repeatSeq();
                        break;
                    default:
                        System.out.println("Invalid option! Please try again.");
                }
                System.out.println("\nDo you want to continue (0/1)?");
                ch = sc.nextInt();
            } while (ch == 1);
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Program terminated.");
        }
    }
}
