public class Transaction {
    public Transaction(String type, double amount, String category, String description, String date) {
        this.type = type;
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.date = date;
    }

    private String type;
    private double amount;
    private String category;
    private String description;
    private String date;

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public String getType(){
        return type;
    }


}
