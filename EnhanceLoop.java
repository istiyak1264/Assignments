import java.util.Scanner;

public class EnhanceLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 2, 5, 3, 7, 11 };
        for (int x : arr) {
            if (x > 3 && x < 11) {
                System.out.print(x + " ");
            }
        }
        sc.close();
    }
}
