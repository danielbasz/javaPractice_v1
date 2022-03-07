/**
   This is code for Part 1.
   YOUR TASK is to create a subclass named RegularAction. This is 
   a subclass of the Action Superclass.
   Action has a description (for example,
   "Wash your hands") and occurs on one or more dates.
   A regularaction activity occurs every day.
 */

//YOUR CODE STARTS HERE!!!!

public class RegularAction extends Action
{

	/**
    Constructs a RegularAction with a description.
	 */
	public RegularAction(String description) {

		super(description);

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

		return true; 
	}
	
}







