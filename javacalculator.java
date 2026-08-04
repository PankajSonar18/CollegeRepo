import java.util.Scanner;

public class javacalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean again = true;

        System.out.println("===== Java Calculator =====");
        System.out.println("Supported operators: +, -, *, /, %, ^");

        while (again) {
            try {
                System.out.print("\nEnter first number: ");
                double a = sc.nextDouble();

                System.out.print("Enter operator: ");
                String operator = sc.next();

                System.out.print("Enter second number: ");
                double b = sc.nextDouble();

                double result;

                switch (operator) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        if (b == 0) {
                            System.out.println("Error: Cannot divide by zero.");
                            continue;
                        }
                        result = a / b;
                        break;
                    case "%":
                        if (b == 0) {
                            System.out.println("Error: Cannot divide by zero.");
                            continue;
                        }
                        result = a % b;
                        break;
                    case "^":
                        result = Math.pow(a, b);
                        break;
                    default:
                        System.out.println("Invalid operator. Please use +, -, *, /, %, or ^.");
                        continue;
                }

                if (Double.isFinite(result)) {
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Result is not a finite number.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter numbers only.");
                sc.nextLine();
            }

            System.out.print("\nDo you want to perform another calculation? (y/n): ");
            String choice = sc.next().trim().toLowerCase();
            again = choice.equals("y") || choice.equals("yes");
        }

        System.out.println("Thank you for using Java Calculator.");
        sc.close();
    }
}
