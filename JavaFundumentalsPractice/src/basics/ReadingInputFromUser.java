package basics;

import java.util.Scanner;

public class ReadingInputFromUser {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		
		String name = scanner.nextLine();
		
		System.out.println("Enter Your Age: ");
	
		int age = scanner.nextInt();
	
		System.out.println("Enter your Gender(M/F): ");
		
		char gender = scanner.next().charAt(0);
		
		System.out.println("Enter your Number: ");
		
		long mobile = scanner.nextLong();
		
		System.out.println("User Details: ");
		
		System.out.println("Name: " +name);
		System.out.println("Age: " +age);
		System.out.println("Gender: " +gender);
		System.out.println("Mobile Number: " +mobile);
	
		
		
		scanner.close();
	}

}
