import java.lang.reflect.*;

public class ActionDriver {

	public static void main(String[] args) {
		
		//boolean for answer loops
		boolean answer = true;
		
		
		// If Action.class is not the Superclass of RegularAction.class, answer is now false
		if (RegularAction.class.getSuperclass() != Action.class) {
			answer = false;
		}
		
		//Outputs are expected to be true for Action.class as superclass of RegularAction.class
		System.out.println("RegularAction is just a subclass of Action: " + answer);
		System.out.println("Expected: True");
		
		
		
		
		// Declared fields, array of Field objects and got declared fields from Regular Action
		Field[] fields = RegularAction.class.getDeclaredFields();
		
		// As there is no other declared field in RegularAction, the output should be 0
		if(fields.length > 0) {
			answer = false;
		}
		
		
		//There are no additional fields in RegularAction
		System.out.println();
		System.out.println("RegularAction activities have no extra fields: " + answer);
		System.out.println("Expected: true");
		System.out.println();
		
		// Declared a regular action with description "Wash your hands!".
		RegularAction regular = new RegularAction("Wash your hands");	
		
		// toString output of regular, of RegularAction class. Expected value is Wash your hands
		System.out.println("Looking at regular actions: " + regular.toString());
		System.out.println("Expected: Wash your hands");
		
		//if toString returns not "Wash your hands", answer is false
		if (regular.toString() != "Wash your hands") {
			answer = false;
		}
		
		//output for occursOn, expected: true
		System.out.println(regular.occursOn(10, 11, 1984));
		System.out.println("Expected: true");
		
		}
		

	}

