package conditions;

import java.util.Scanner;

public class SwitchConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Admin  - Full Access");
		System.out.println("Subadmin  - create & delete contents");
		System.out.println("Testprep - create & delete Tests");
		
		System.out.println("Enter your role : ");
		String role = scanner.nextLine();		
		switch(role) {
		case "Admin":
			System.out.println("You have Full Access");
			break;
		case "Subadmin":
			System.out.println("You can create & delete contents");
			break;
		case "TestPrep" :
			System.out.println("You can create & delete Tests");
			break;
		default :
			System.out.println("You are a guest");
		
		}

	}

}
