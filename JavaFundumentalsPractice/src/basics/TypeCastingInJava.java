package basics;

public class TypeCastingInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intValue = 590;
		//implicit Type Casting
		//widening Type Casting
		long longValue = intValue;
		
		
	
		System.out.println(intValue);
		System.out.println(longValue);
		
		//Explicit Type Casting
		//Narrowing Type Casting
		double doubleValue = 409.567;
		int intValue2 = (int)doubleValue;
		
		byte byteValue = (byte)intValue2;
		
		System.out.println(doubleValue);
		System.out.println(intValue2);
		System.out.println(byteValue);

	}

}
