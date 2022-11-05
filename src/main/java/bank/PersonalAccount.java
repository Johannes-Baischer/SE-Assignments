package bank;

import java.math.BigDecimal;

public class PersonalAccount extends Account{
    public PersonalAccount(BigDecimal balance, String owner){
        super(balance, new String[] { owner });
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
