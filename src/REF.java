
import java.util.Scanner;

public class REF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        double squareRoot = SquareRoot.calculateSquareRoot(number);

        System.out.println("Square root of " + number + " is: " + squareRoot);
    }
}