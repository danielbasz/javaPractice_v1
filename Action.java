

/**
This is the Action Superclass class that provides a catalog of actions to be carried out in view of COVID-19 OPH protocols.
You are required to complete read and review this code to appropriately fill the required loopholes.
 */
public abstract class Action
{

	protected String description;
	protected int year;
	protected int month;
	protected int day;

	/**
Constructs an default action with no description.
	 */
	public Action()
	{
		this.description = "";
	}

	/**
   Constructs an action with a description.
	 */
	public Action(String description)
	{
		this();
		this.description = description;
	}
	
	public Action (String description, int day) {
		this(description);
		this.day = day;
	}
	
	public Action (String description, int year, int month, int day) {
		this.description = description;
		this.year = year;
		this.month = month;
		this.day = day;
	}

	/**
   Sets the description of this action.
   @param description the text description of the action
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	/**
   Determines if this action occurs on the specified date.
   @param year the year
   @param month the month
   @param day the day
   @return true if the action activity occurs on the specified date.
	 */
	public abstract boolean occursOn(int day, int month, int year);

	/**
   Converts action activity to string description.
	 */
	public String toString()
	{
		return description;
	}
}

