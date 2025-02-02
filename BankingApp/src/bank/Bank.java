package bank;
import java.util.Scanner;
public class Bank
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0; // Initialize balance to 0

        while (true) {
            System.out.println("\nSimple Banking Application");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            if (choice == 4) {
                System.out.println("Exiting...");
                break; // Exit the loop
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    balance += depositAmount;
                    System.out.println("Deposit successful.");
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    if (withdrawalAmount <= balance) {
                        balance -= withdrawalAmount;
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 3:
                    System.out.println("Current balance: $" + balance);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        }
        
    }
}
