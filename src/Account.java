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

    public 
}
