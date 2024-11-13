package conditions;

public class ConditionsWithOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isLoggedIn = true;
		boolean isEmailVerified = false;
		boolean isCardInfoValid = true;
		
		//using operators
		if(isLoggedIn && isEmailVerified && isCardInfoValid) {
			System.out.println("You are allowed to purchase");
		}
		else
			System.out.println("You are not allowed to purchase");
		
		if(isLoggedIn) {
			if(isEmailVerified) {
				if(isCardInfoValid) {
					System.out.println("You are allowed to purchase");
				}
			}
		}
	}

}
