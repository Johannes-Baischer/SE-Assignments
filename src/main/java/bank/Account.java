package bank;

import java.math.BigDecimal;

/**
 * A bank account. This is an abstract base class for
 * <code>PersonalAccount</code> and <code>CorporateAccount</code>.
 * 
 */
public abstract class Account {
	protected BigDecimal balance;

	/**
	 * Withdraws the given amount from the account's balance.
	 * 
	 * @param amount the amount to withdraw
	 * @return boolean true iff the withdraw operation was successful
	 */
	protected abstract boolean withdraw(BigDecimal amount);

	/**
	 * @return the balance of the account
	 */
	public BigDecimal getBalance() {
		return null;
	}

}
