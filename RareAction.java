
/**
	   In this file you will provide the code solution for Part 2. 
	   You are required to create a subclass named OccasionalAction.
	   These are activities that occur on the same day of every month specified.
 */

// YOUR CODE STARTS HERE!!!

public class RareAction extends Action
{

	/**
	    Constructs a action with a description.
	 */
	public RareAction(String description, int day, int month, int year) {

		super(description, day, month, year);
		
	}


	/**
			   Determines if this action occurs on the specified date.
			   @param year the year
			   @param month the month
			   @param day the day
			   @return true if the action activity occurs on the specified date.
			   @Override Overrides super method
	 */
	public boolean occursOn(int year, int month, int day) {



		if (day == super.day && month == super.month && year == super.year) {

			return true; 
		}
		else {
			return false;
		}
	}





}



