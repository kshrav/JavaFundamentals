package operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 30;
		int num2 = 12;
		int num3 = num1;

		num3 = num1;
		System.out.println("num3: "+ num3);
		
		num1 += num2;
		
		System.out.println("num1 += num2: "+ num1);
		
		num1 -= num2;
		
		System.out.println("num1 -= num2: "+ num1);
		
		num1 *= num2;
		
		System.out.println("num1 *= num2: "+ num1);
		
		num1 /= num2;
		
		System.out.println("num1 /= num2: "+ num1);
		
		num1 %= num2;
		
		System.out.println("num1 %= num2: "+ num1);
		
		

	}

}
