package conditions;

public class IfElseIfConditionalStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sellingPrice = 1200, costPrice = 1000;
		
		if(sellingPrice > costPrice) {
			System.out.println("profit");
		}
		else if(sellingPrice < costPrice)
			System.out.println("Loss");
		else
			System.out.println("no profit no loss");

	}

}
