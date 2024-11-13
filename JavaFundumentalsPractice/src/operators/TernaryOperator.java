package operators;

public class TernaryOperator {
	public static void main(String[] args) {
		
		
		boolean isAuthenticated = true;
		
		if(isAuthenticated) {
			System.out.println("Logged in Success");
			
		}
		else {
			System.out.println("Logged in unsuccessful");
		}
		
		String result = (isAuthenticated) ? "LoggedIn" : "Not LoggedIn";
		
		System.out.println(result);
		
	}

}
