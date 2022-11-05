package bank;

import java.math.BigDecimal;

/**
 * A bank account. This is an abstract base class for
 * <code>PersonalAccount</code> and <code>CorporateAccount</code>.
 * 
 */
public abstract class Account {
	protected BigDecimal balance;
	protected String[] owner;
	private String id;

	protected Account(BigDecimal balance, String... owner){
		this.balance = balance;
        this.owner = owner;

		for(String o : this.owner){
			id += o;
		}
		id += System.currentTimeMillis();
	}

	/**
	 * Withdraws the given amount from the account's balance.
	 * 
	 * @param amount the amount to withdraw
	 * @return boolean true iff the withdraw operation was successful
	 */
	protected abstract boolean withdraw(BigDecimal amount);

	public boolean deposit(BigDecimal amount){
		balance.add(amount);

		return balance != null;
	}

	/**
	 * @return the balance of the account
	 */
	public BigDecimal getBalance(){
		return balance;
	}

	/**
	 * @return the unique account id
	 */
	public String getID(){
		return id;
	}
	
}
