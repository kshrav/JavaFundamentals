package arrays;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Hello";
		String lastWord = " World";
		
		String fullName = name + lastWord;
		System.out.println(fullName);
		
		System.out.println(name.length());
		System.out.println(name.concat(lastWord));
		System.out.println(name.toLowerCase());
		System.out.println(lastWord.toUpperCase());
		System.out.println(fullName.substring(0, 5));
		System.out.println(fullName.charAt(7));
		System.out.println(fullName.contains(lastWord));
		System.out.println(name.equals(fullName));
		System.out.println(fullName.trim());
		
	}

}
