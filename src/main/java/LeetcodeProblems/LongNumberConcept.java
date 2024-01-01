package LeetcodeProblems;

public class LongNumberConcept {

	public static void main(String[] args) {
		
		long longNumberWithoutL = 1000*24*60*60*365;
		long longNumberWithL = 1000*24*60*60*365L;
		
		System.out.println(longNumberWithoutL);			// Integer is of 32 bit and maximum limit of 32 bit inter is : 2147483647
		System.out.println(longNumberWithL);
		
		
		System.out.println(Double.MIN_VALUE);			// +ve Number
		System.out.println(Long.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));

	}

}
