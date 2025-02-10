package StateDesignPattern;

public class ActiveState implements AccountState {
    private AccountState accountState;

    public ActiveState(Account account) {
        this.account = account;
    }

    @Override
    public void deposit(String accountNumber, double balance) {
        account.setAccountNumber();
        System.out.println(account.toString);
    }

    @Override
    public void activate() {
        System.out.println("Account is activated!");
    }

    @Override
    public void suspend() {
        System.out.println("Account is suspended!");
    }

}