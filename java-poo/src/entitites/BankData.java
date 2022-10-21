package entitites;

public class BankData {

    private String clientName;
    private final String bankAccount;
    private double balance;

    public BankData(String clientName, String bankAccount){
        this.clientName = clientName;
        this.bankAccount = bankAccount;
    }

    public BankData(String clientName, String bankAccount, double initialDeposit){
        this.clientName = clientName;
        this.bankAccount = bankAccount;
        deposit(initialDeposit);
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void newClientName(String newClientName) {
        this.clientName = newClientName;
    }

    public void deposit(double depositValue) {
        this.balance += depositValue;
    }

    public void withdraw(double withdrawValue) {
        this.balance = balance - (withdrawValue + 5);
    }

    public String toString() {
        return "Client name: "
                + clientName
                + ", "
                + "Account: "
                + bankAccount
                + ", "
                + "Balance: $ "
                + String.format("%.2f", balance);
    }
}
