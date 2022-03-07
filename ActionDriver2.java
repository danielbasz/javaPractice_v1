
public class ActionDriver2 {

	public static void main(String[] args) {
		
		 boolean answer = true;
		 
		// If Action.class is not the Superclass of RegularAction.class, answer is now false
			if (OccasionalAction.class.getSuperclass() != Action.class) {
				answer = false;
			}
			
			//Outputs are expected to be true for Action.class as superclass of OccaisonalAction.class
			System.out.println("OccaisonalAction is just a subclass of Action: " + answer);
			System.out.println("Expected: true");

			// If Action.class is not the Superclass of RegularAction.class, answer is now false
				if (RareAction.class.getSuperclass() != Action.class) {
					answer = false;
				}
						
				//Outputs are expected to be true for Action.class as superclass of RareAction.class
				System.out.println("RareAction is just a subclass of Action: " + answer);
				System.out.println("Expected: true");	
			
	}

}
