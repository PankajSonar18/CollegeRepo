import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Initialize balance
        double balance = 10000;

        int choice;

        System.out.println("===== BANK ACCOUNT SYSTEM =====");

        // Keep showing menu until user selects Exit
        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                // Check Balance
                case 1:
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                // Deposit
                case 2:
                    try {
                        System.out.print("Enter deposit amount: ₹");
                        double amount = sc.nextDouble();

                        if (amount < 0) {
                            throw new IllegalArgumentException(
                                "Deposit amount cannot be negative."
                            );
                        }

                        balance = balance + amount;

                        System.out.println(
                            "Amount deposited successfully."
                        );
                        System.out.println(
                            "Updated Balance: ₹" + balance
                        );

                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());

                    } finally {
                        System.out.println("Thank you for using Deposit Service.");
                    }
                    break;

                // Withdraw
                case 3:
                    try {
                        System.out.print("Enter withdrawal amount: ₹");
                        double amount = sc.nextDouble();

                        if (amount < 0) {
                            throw new IllegalArgumentException(
                                "Withdrawal amount cannot be negative."
                            );
                        }

                        if (amount > balance) {
                            throw new ArithmeticException(
                                "Insufficient balance."
                            );
                        }

                        balance = balance - amount;

                        System.out.println(
                            "Amount withdrawn successfully."
                        );
                        System.out.println(
                            "Updated Balance: ₹" + balance
                        );

                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());

                    } catch (ArithmeticException e) {
                        System.out.println("Error: " + e.getMessage());

                    } finally {
                        System.out.println("Thank you for using Withdrawal Service.");
                    }
                    break;

                // Exit
                case 4:
                    System.out.println("Thank you for using our Bank System!");
                    break;

                // Invalid choice
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();

        System.out.println("===== PROGRAM ENDED =====");
    }
}