import java.util.InputMismatchException;
import java.util.Scanner;

public class kak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter two integers: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x / y;

            System.out.println(x + "/" + y + "=" + z);
        } catch (ArithmeticException ex) {
            System.out.println("---catch block (arithmetic) ---");
            System.out.println(ex.toString());
        } catch (InputMismatchException ex) {
            System.out.println("---catch block (input) ---");
            System.out.println("Please enter whole numbers only.");
        } finally {
            System.out.println("---finally block ---");
            sc.close();
        }
        System.out.println("End of the program");
    }
}