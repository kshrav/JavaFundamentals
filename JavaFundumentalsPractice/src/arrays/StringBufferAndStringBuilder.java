package arrays;

public class StringBufferAndStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long startTime = System.currentTimeMillis();
		StringBuffer buffer = new StringBuffer();
		
		System.out.println(buffer.capacity());
		//buffer.append("Hello ");
		
		for(int i =0; i< 10000; i++) {
			buffer.append("World");
		}
//		System.out.println(buffer);
		System.out.println("Time taken by String Buffer: " + (System.currentTimeMillis() - startTime));

		StringBuilder builder = new StringBuilder();
		
		System.out.println(builder.capacity());
		
		for(int i = 0; i < 10000 ; i++) {
			builder.append("World");
		}
//		System.out.println(builder);
		System.out.println("Time taken by String Builder: " + (System.currentTimeMillis() - startTime));

		
	}

}
