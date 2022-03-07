import java.lang.reflect.*;

public class ActionDriver {

	public static void main(String[] args) {
		
		boolean answer = true;
		
		
	//	RegularAction regular = new RegularAction("Wash my hands!");
	
		
		if (!(RegularAction.class.getSuperclass() == Action.class)) {
			answer = false;
		}
		
		
		System.out.println("Regular Action is just a subclass of Action: " + answer);
		System.out.println("Expected: True");
		
		
		
		
		Field[] fields = RegularAction.class.getDeclaredFields();
		
		System.out.println(fields.length);
		
		
		
		
		
		
		System.out.println(RegularAction.class.getFields() == Action.class.getFields());
		
		System.out.println("Regular Action activities have no extra fields: " + answer);
		System.out.println("Expected: true");
		
		System.out.println(RegularAction.class.getDeclaredFields().length);
		System.out.println(Action.class.getDeclaredFields().length);
		}
		

	}

