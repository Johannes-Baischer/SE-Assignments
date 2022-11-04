package bank;

import java.math.BigDecimal;

public class PersonalAccount extends Account{
    private String owner;

    public PersonalAccount(BigDecimal balance, String owner){
        this.balance = balance;
        this.owner = owner;
    }

    @Override
    /**{@inheritDoc} */
    protected boolean withdraw(BigDecimal amount) {
        if(balance.subtract(amount).signum() >= 0){
            balance = balance.subtract(amount);
            return true;
        }
            
        return false;
    }
    
}
