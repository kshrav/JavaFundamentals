package basics;


import java.util.Date;

public class VariablesAndTypes {
	public static void main(String[] args) {
		
		
		//Primitive Datatype
		byte value = 28;
		int age = 24;
		double height = 5.4;
		float number = 92398498f;
		char gender = 'f';
		boolean Working_Empolyee = true;
		
		System.out.println(value);
		System.out.println(age);
		System.out.println(height);
		System.out.println(number);
		System.out.println(gender);
		System.out.println(Working_Empolyee);
		
		
		//Non Primitive datatype or reference type 
		
		String name ="Shravya";
		String name2 = name;
		
		Date date = new Date();
		
		System.out.println(name);
		System.out.println(name2);
		
		name = "Katukojwala";
		System.out.println(name);
		System.out.println(name2);
		System.out.println(date);
		
	}

}

