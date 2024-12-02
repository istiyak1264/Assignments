import java.util.Scanner;

public class TriangleValidator {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in))
        {
            System.out.print("Enter first side: ");
            int a = scanner.nextInt();
            System.out.print("Enter second side: ");
            int b = scanner.nextInt();
            System.out.print("Enter third side: ");
            int c = scanner.nextInt();

            if (a > 0 && b > 0 && c > 0) {
                if (a + b > c) {
                    if (a + c > b) {
                        if (b + c > a) {
                            System.out.println("The triangle is valid.");
                        }
                        else
                        {
                            System.out.println("The triangle is not valid.");
                        }
                    }
                    else {
                        System.out.println("The triangle is not valid.");
                    }
                } else {
                    System.out.println("The triangle is not valid.");
                }
            }
            else
            {
                System.out.println("Sides must be positive numbers.");
            }
        }

        
    }
}
