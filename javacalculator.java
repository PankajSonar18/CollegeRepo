import java.util.Scanner;

public class javacalculator {
    public static void main(String args[]) {
        System.out.println("-----Java Calculator-----");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float a = sc.nextFloat();

        System.out.print("Enter operator: ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        float b = sc.nextFloat();

        switch (operator) {
            case '+':
                System.out.println("Addition: " + (a + b));
                break;
            case '-':
                System.out.println("Subtraction: " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Division: " + (a / b));
                } else {
                    System.out.println("Error: Cannot divide by zero");
                }
                break;
            case '%':
                if (b != 0) {
                    System.out.println("Modulus: " + (a % b));
                } else {
                    System.out.println("Error: Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Enter valid operator");
        }

        sc.close(); // Closed scanner to prevent memory leaks
    }
}
