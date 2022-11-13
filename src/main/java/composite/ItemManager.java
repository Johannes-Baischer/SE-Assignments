package composite;

import java.io.InputStream;
import java.util.Optional;

/**
 * Class for managing items.
 * 
 */
 
public class ItemManager {
	
	public ItemManager() {
		//TODO
	}

	/**
	 * Reads the xml data from the input stream or throws an Exception if anything
	 * goes wrong (e.g., the xml code is invalid or some price attribute cannot be converted to type double).
	 * Items are assumed to have a unique name.
	 * The input stream is allowed to have empty lists.
	 * This is the only method where xml is handled in this assignment. No other method in this class should contain (or call)
	 * xml-specific code.
	 */
	public void readXml(InputStream xmlData) throws Exception{
		//TODO
	}

	/**
	 * Returns an {@code Optional} instance representing the price of the item (cd,
	 * book, or list) with the given name; the {@code Optional} is empty, if
	 * no such item exists
	 */
	public Optional<Double> getPrice(String item){
		return null;//TODO
	}

	/**
	 * removes the item with the given name, unless it's the root
	 * returns true if the operation succeeded (item found and removed)
	 * returns false if item is the root, or it is not found, or it cannot be removed due to some other error
	 */
	public boolean removeItem(String item) {
		return false;//TODO
	}

	/**
	 * changes the price of the item with the given name; 
	 * returns false if item is not found or it is a list, or if the price is smaller than or equal to 0,
	 * returns false if the price could not be changed for any other reason;
	 * returns true if the price was changed successfully (i.e., the item had a different price before); 
	 */
	public boolean changePrice(String item, double price) {
		return false;
	}
}