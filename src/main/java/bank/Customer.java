package bank;

import java.util.Date;

/**
 * A customer. Customers are identified by a unique id.
 *
 */
public class Customer {

	Customer(String firstName, String lastName, Date birthDay) {
	}

	/**
	 * @return the first name of this customer
	 */
	protected String getFirstName() {
		return "";
	}

	/**
	 * @return the last name of this customer
	 */
	protected String getLastName() {
		return "";
	}

	/**
	 * @return the birthday of this customer
	 */
	protected Date getBirthDay() {
		return null;
	}
}
