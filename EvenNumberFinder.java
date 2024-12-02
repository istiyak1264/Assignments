import java.util.Scanner;

public class EvenNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        System.out.println("Even numbers up to " + end + ":");
        int i = 2;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= end);

        scanner.close();
    }
}
