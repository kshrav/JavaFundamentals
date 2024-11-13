package arrays;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] studentMarks = {
				{48, 36, 45, 25, 39, 30},
				{29, 49, 32, 26, 35, 45},
				{21, 24, 45, 34, 30, 41}
		};
		
		for(int i = 0; i < studentMarks.length; i++) {
			
			for(int j = 0; j < 6; j++) {
				System.out.print(studentMarks[i][j] +"\t");
				
			}
			System.out.println();
		}

	}

}
