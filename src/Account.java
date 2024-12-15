import java.util.ArrayList;

public class Account {
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private double balance = 0;
    private double savingsGoal = 0;

    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
        if (transaction.getType().equalsIgnoreCase("income")){
            balance += transaction.getAmount()
        } else if (transaction.getType().equalsIgnoreCase("expense")) {
            balance -= transaction.getAmount();
        }
    }

    public void deleteTransaction(int index){
        if (index >= 0 && index < transactions.size()){
            Transaction transaction = transactions.remove(index);
            if (transaction.getType().equalsIgnoreCase("income")){
                balance -= transaction.getAmount();
            }
            else{
                balance += transaction.getAmount()
            }
        }
    }

    public void setSavingsGoal(double goal){
        this.savingsGoal = goal;
    }

    public void printSummary(){
        double totalIncome = 0, totalExpenses = 0;
        for (Transaction t : transactions){
            if (t.getType().equalsIgnoreCase("income")){
                totalIncome += t.getAmount();
            }
            else {
                totalExpenses += t.getAmount();
            }
        }
        System.out.println("\n=== Account Summary === ");
        System.out.println("Total Income: $" + totalIncome);
        System.out.println("Total Expenses: $" + totalExpenses);
        System.out.println("Remaining Balance: $" + savingsGoal);
        System.out.println("Progress Towards Goal: $" + (balance >= savingsGoal ? "Goal reached!" : balance));

    }
    public void printTransactions(){
        if (transactions.isEmpty()){
            System.out.println("No transactions recorded.");
        }
        else {
            for (int i = 0; i < transactions.size(); i++){
                System.out.println(i + ": " + transactions.get(i));
            }
        }
    }
}
