package entities;

/**
 *
 * @author Felipe Pereira
 */
public final class SavingsAccount extends Account {
    
    private Double interestRate;
    
    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Double interestRate, Integer number, String holder, Double balance) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
    
    public void updateBalance() {
        balance += balance * interestRate;
    }
    
    @Override
    public final void withdraw(Double amount) {
        balance -= amount;
    }
    
}
