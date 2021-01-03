public class CheckingAccount {

    private int balance;

    public CheckingAccount(int initialBalance){
        balance = initialBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public boolean withdraw(int amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public void PrintLatestTransactions(){
        throw new RuntimeException();
    }
}
