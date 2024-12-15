import java.util.ArrayList;
import java.util.Scanner;

public class BudgetManager {
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private double balance = 0;
    private double savingsGoal = 0;
    private Scanner scanner = new Scanner(System.in); //Why make a Scanner object private?

    public void start(){
        while (true){
            System.out.println("\n=== Personal Finance Manager ===");
            System.out.println("1. Add Transaction");
            System.out.println("2. View Summary");
            System.out.println("3. Set Savings Goal");
            System.out.println("4. View All Transactions");
            System.out.println("5. Delete Transaction");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1 -> addTransaction();
                case 2 -> printSummary();
                case 3 -> setSavimgsGoal();
                case 4 -> printTransactions();
                case 5 -> deleteTransaction();
                case 6 -> {
                    System.out.println("Thank you for using the Personal Finance Manager. Goodbye :)");
                    return;
                }
                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }

    public void addTransaction(){
        System.out.println("Enter type (income/expense): ");
        String type = scanner.nextLine();
        System.out.println("Enter amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter category: ");
        String category = scanner.nextLine();
        System.out.print("Enter description: ");
        String description = scanner.nextLine();
        //String date =
        //There's no need to prompt the user for date, just display it while viewing transactions

        Transaction transaction = new Transaction(type, amount, category, description, date);
        transactions.add(transaction);
        balame += type.equalsIgnoreCase("income") ? amount : -amount;//explain this line

        System.out.println("Transaction added successfully!");
    }
    public static void main(String[] args) {

    }
}
