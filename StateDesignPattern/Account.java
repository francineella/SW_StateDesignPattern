package StateDesignPattern;

public class Account {
    private String accountNumber;
    private double balance;
    private AccountState state;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.state = new ActiveState();
    }

    public void deposit(double amount) {
        state.deposit(this,amount);
    }

    public void withdraw(double amount) {
        state.withdraw(this,amount);
    }

    public void suspend() {
        state.suspend(this);
    }

    public void activate() {
        state.activate(this);
    }

    public void close() {
        state.close(this);
    }

    public void setState(AccountState state) {
        this.state = state;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public AccountState getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Account number: " + accountNumber + "\nBalance: " + balance;
    }


}