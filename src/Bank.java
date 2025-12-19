public class Bank{
    public Account openAccount(Customer customer, double initialBalance){
        return new Account(customer, initialBalance);
    }
    public boolean transfer(Account from, Account to, double amount){
        if (amount <=0) return false;
        if (from.getBalance() < amount) return false;

        Transaction tx = new Transaction(from, to, amount);
        from.apply(tx);
        to.apply(tx);
        return true;
    }
}