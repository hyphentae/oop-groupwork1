public class Account {
    private Customer owner;
    private double balance;

    public Account(Customer owner, double balance) {
        if (owner == null) throw new IllegalArgumentException();
        if (balance < 0) throw new IllegalArgumentException();

        this.owner = owner;
        this.balance = balance;
    }

    public void apply(Transaction tx) {
        if (this == tx.getFrom()) {
            balance -= tx.getAmount();
        } else if (this == tx.getTo()) {
            balance += tx.getAmount();
        }
    }

    public double getBalance() {
        return balance;
    }
}
