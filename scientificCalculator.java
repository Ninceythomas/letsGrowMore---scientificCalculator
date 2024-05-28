import java.util.Scanner;
import java.lang.Math;

public class ScientificCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Scientific Calculator ---");
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Sine");
            System.out.println("6. Cosine");
            System.out.println("7. Tangent");
            System.out.println("8. Logarithm");
            System.out.println("9. Power");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 10) {
                System.out.println("Goodbye!Exiting from Scientific calculator ");
                break;
            }

            double num1, num2;
            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    System.out.print("Enter first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    num2 = scanner.nextDouble();
                    if (num2 != 0) {
                        System.out.println("Result: " + (num1 / num2));
                    } else {
                        System.out.println("Error! Division by zero.");
                    }
                    break;
                case 5:
                    System.out.print("Enter an angle in radians: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + Math.sin(num1));
                    break;
                case 6:
                    System.out.print("Enter an angle in radians: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + Math.cos(num1));
                    break;
                case 7:
                    System.out.print("Enter an angle in radians: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + Math.tan(num1));
                    break;
                case 8:
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    if (num1 > 0) {
                        System.out.println("Result: " + Math.log(num1));
                    } else {
                        System.out.println("Error! Logarithm of a non-positive number.");
                    }
                    break;
                case 9:
                    System.out.print("Enter the base number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + Math.pow(num1, num2));
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}
