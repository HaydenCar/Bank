//Transaction.java
public class Transaction implements Comparable {

    private double amount;
    private int time;
    private String type;

    public Transaction(double amount, int time, String type) {
        this.amount = amount;
        this.time = time;
        this.type = type;
    }


    public double getAmount() {
        return amount;
    }

    public int getTime() {
        return time;
    }

    public String getType() {
        return type;
    }


    public int compareTo(Object arg) {
        Transaction b = (Transaction) arg;
        if (this.time > b.time) {
            return 1;
        }
        if (this.time < b.time) {
            return -1;
        } else {
            return 0;
        }
    }

    public void execute(Account account) {
        if ("DEPOSIT".equalsIgnoreCase(type)) {
            account.setBalance(account.getBalance() + amount);
        } else if ("WITHDRAW".equalsIgnoreCase(type)) {
            account.setBalance(account.getBalance() - amount);
        }
    }

}
