import java.util.Scanner;
    
class ATM {
    double balance = 10000; // initial balance

    // Check balance
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    // Deposit money
    void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid deposit amount!");
        }
        balance += amount;
        System.out.println("Amount Deposited: " + amount);
    }

    // Withdraw money
    void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid withdrawal amount!");
        }
        if (amount > balance) {
            throw new ArithmeticException("Insufficient funds!");
        }
        balance -= amount;
        System.out.println("Amount Withdrawn: " + amount);
    }
}

public class ATMSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();
        int choice;

        do {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            try {
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        atm.checkBalance();
                        break;

                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double dep = sc.nextDouble();
                        atm.deposit(dep);
                        break;

                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        double wd = sc.nextDouble();
                        atm.withdraw(wd);
                        break;

                    case 4:
                        System.out.println("Thank you!");
                        break;

                    default:
                        System.out.println("Invalid choice!");
                }

            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter correct data.");
                sc.nextLine(); // clear buffer

            } finally {
                System.out.println("Transaction processed.");
            }

        } while (true);
    }
}