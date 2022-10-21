package entities;

/**
 *
 * @author Felipe Pereira
 * 
 */
public final class BusinessAccount extends Account {
    
    private Double loanLimit;
    
    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Double loanLimit, Integer number, String holder, Double balance) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    
    public void loan(Double amount) {
        if(amount <= loanLimit){
            balance += amount - 10.0;
        }
    }
    
    @Override
    public final void withdraw(Double amount) {
        super.withdraw(amount);
        balance -= amount + 2.0;
    }
    
}
