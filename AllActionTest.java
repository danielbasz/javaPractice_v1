import java.util.Scanner;
import java.lang.reflect.*;

// Assignment01 covers the application of java reflection techniques and polymorphism of classes.
// We have a main abstract class named Action that is extended by RegularAction, OccasionalAction and
// RareAction - all with their own implementation of Action.class.
// @author Daniel Barboza, based off Assignment01 base code from Algonquin Staff


/**
   AllActionTest class demonstrates the Action class and subclasses.
   We have an array of action objects named actions with different action activities.
   First, a user is asked for a date to input. This date is checked against all the activities
   in the action array to see if the action happened on the date that was inputed.
   If there is a match, the .toString is called on that action description and outputed to the user.
   
   You should reuse the Action class and RegularAction classes from Part I of your solution
   and then the OccasionalAction and RareAction classes from your Part 2.
	@author Daniel Barboza, based off Assignment01 base code from Algonquin Staff
*/


public class AllActionTest
{
   public static void main(String[] args)
   {
	//Scanner object declaration
	  Scanner keyboard = new Scanner(System.in);
	  
	   
	//Population of Action array:  
	//Regular actions
	  RegularAction meters = new RegularAction("Sit two meters apart");
	  RegularAction water = new RegularAction("Wash your hands.");
	  RegularAction meditate = new RegularAction("Meditate for 15 minutes");
	  
	//Occasional actions
	  OccasionalAction pcr = new OccasionalAction("Take a PCR Test", 01);
	  OccasionalAction sunLight = new OccasionalAction("Get Sunlight!", 15);
	  OccasionalAction meeting = new OccasionalAction("Gathering meeting for Staff", 01);
	  OccasionalAction groceries = new OccasionalAction("Special Groceries Permited", 02);
	  
	//Rare actions
	  RareAction uv = new RareAction("UV treatment on clothes and equipment", 2022,02,16);
	  RareAction booster = new RareAction("Get a boostershot", 2022,06,01);
	  RareAction booster2 = new RareAction("Get a boostershot", 2022,12,15);
	 
	  //Array of Action.class objects
	  Action[] actions = {water , sunLight, meditate, groceries, uv, booster, booster2, pcr, meters, meeting};
			   
	  //Declarations for user date input
	   int day = 0;
	   int year = 0;
	   int month = 0;
	   
	   
	   
	   
	   //Input from user
	   System.out.println("Enter a date like so YYYY MM DD : ");
	   year = keyboard.nextInt();
	   month = keyboard.nextInt();
	   day = keyboard.nextInt();
	   
	   //Actions on user inputed dates:
	   System.out.println("These are your actions on " + year + '\\' + month + '\\'+ day);
	   
	   //Loops array of Action.class objects
	   for (int i=0 ; i < actions.length ; i++) {   
		//checks occoursOn vs user inputed date.
		//Prints description of action object from array if action date matches user input
	   if (actions[i].occursOn(year, month, day)) {
		   System.out.println(actions[i].toString());
	   }
	   
		   
	   }

   }
}

