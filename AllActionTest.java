import java.util.Scanner;

//Java program to demonstrate get() method

import java.lang.reflect.Field;
/**
   In this file, you are required to write code for your part Part 3. 
   The reason for this class is to demonstrate the Action class and subclasses.
   You must fill an array of action objects (hint: check the sample output file provided for you) with
   different action activities. A user of this system should be able to input a date of their choice and
   retrieve an output of all activities that would occur on that date.
   You should reuse the Action class and RegularAction classes from Part I of your solution
   and then the OccasionalAction and RareAction classes from your Part 2.
*/

// YOUR CODE STARTS HERE!!!

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
	   };
	   
	   
	   //Reflect
	   
//	   Class actionClass = actions[4].getClass();
//	   
////	   Field agefield.
//	   
////	   String classname = actionClass.getName();
//	   
//	 
//	   
//	   
//	   Field[] field = actionClass.getDeclaredFields();
//	   
//	   Object value = field[2].getName();
//	   
//	   
	   
//	   Class aClass = actions[5].getClass();
	   
//	   Field[] fields = aClass.getDeclaredFields();
	   
//	   for(int t =0; t < fields.length; t++) {
	   
//	   Object value = fields[0].get();
		   
//	   System.out.println(value);
////	   }
//		 

		
		
		
//		System.out.println(value);
		
		   
	   }

   }
}

