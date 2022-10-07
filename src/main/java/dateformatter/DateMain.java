package dateformatter;

public class DateMain {
	
	/**
	 * Reformats a date representation
	 * 
	 * @param sourceFormat  : format code of the date parameter		
	 * @param date			: date to be reformatted
	 * @param destFormat	: target format
	 * @return				: date string according to destFormat
	 * 						: null if format is invalid or date does not correspond to sourceFormat
	 */
	public static String formatDate(String sourceFormat, String date, String destFormat) {		
		return null;
	}
	
	/**
	 * Checks correctness of full date 
	 * 
	 * @param formatCode	: format code, must have the full year (4 digits)
	 * @param date			: the date to be checked
	 * @return				: true if date is correct (page 2 in pdf file) and valid according to the formatCode, false otherwise
	 * 
	 * Examples: 
	 * 
	 * isDateCorrect("A/4","02/29/1900") returns false
	 * isDateCorrect("A/4","02/29/1904") returns true
	 * isDateCorrect("A.4","02/29/1904") returns false
	 * 
	 */
	public static boolean isDateCorrect(String formatCode, String date) {
		return false;
	}

	/**
	 * Reformats multiple dates from file. Creates new file with the results.
	 * 
	 * @param inputFile : name of existing file with three strings per line: source format,date,target format
	 * @param outputFile: name of new file with the transformed dates
	 * 		- for a correct input date, the corresponding line has the format: target format,date
	 * 		- for an invalid/incorrect input date (see page 2 in pdf file), the output line should consist of the word INVALID  
	 * @return true if operation successful, false if output file already exists or if file access operations did not succeed 
	 * 
	 * Examples of input lines:
	 * 
	 * A/4,10/03/2022,B-4b
	 * C-4,17/12/2000,A/2
	 * B-2b,22- 8- 5,B-2
	 * A/4b, 2/29/2099,C/2
	 * C.4,03.10.2022,A/4b
	 *
	 * 
	 * The corresponding output lines:
	 * 
	 * B-4b,2022-10- 3
	 * INVALID
	 * B-2,22-08-05
	 * INVALID
	 * A/4b,10/ 3/2022
	 * 
	 */
	public static boolean transformDates(String inputFile, String outputFile) {
		return false;
	}
}
