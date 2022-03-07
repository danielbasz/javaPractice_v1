
/**
	   In this file you will provide the code solution for Part 2. 
	   You are required to create a subclass named OccasionalAction.
	   These are activities that occur on the same day of every month specified.
 */

// YOUR CODE STARTS HERE!!!

public class RareAction extends OccasionalAction
{

	private int year;



	/**
	    Constructs a action with a description.
	 */
	public RareAction(int day, int month, int year) {

		super("This is a Rare Action");


	}


	/**
			   Determines if this action occurs on the specified date.
			   @param year the year
			   @param month the month
			   @param day the day
			   @return true if the action activity occurs on the specified date.
			   @Override Overrides super method
	 */
	public boolean occursOn(int day, int month, int year) {



		if (day > 0 && month > 0 && year > 0) {

			return true; 
		}
		else {
			return false;
		}
	}





}



