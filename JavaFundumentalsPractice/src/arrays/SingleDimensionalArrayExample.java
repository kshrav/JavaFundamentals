package arrays;

public class SingleDimensionalArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] marks = new int[]{2, 5, 9 ,3, 4};
		
		for(int i = 0; i < marks.length; i++) {
			System.out.print(marks[i]);
			
			System.out.print('\t');
		}
		
		System.out.println(".....");
		for(int value: marks) {
			System.out.print(value);
			
			System.out.print('\t');
		}

	}

}
