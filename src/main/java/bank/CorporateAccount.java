package bank;

import java.math.BigDecimal;

public class CorporateAccount extends Account{
    private String[] owner;

    public CorporateAccount(BigDecimal balance, String... owner){
        this.balance = balance;
        this.owner = owner;
    }

    @Override
    /**{@inheritDoc} */
    protected boolean withdraw(BigDecimal amount) {
        balance = balance.subtract(amount);
        return true;
    }
    
}
