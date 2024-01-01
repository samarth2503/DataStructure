package LeetcodeProblems;

public class DivideNumberByZero {

	public static void main(String[] args) {
		
		
		// Double and Folating give output as Infinity when we divide by zero
		System.out.println(9.0/0);	
		
		System.out.println(12.33f/0);
		
		System.out.println(10/0.0);
		//System.out.println(0/0);
		System.out.println(0.0/0);					// op:- NaN
		System.out.println(0.0/0.0);				// NaN

	}

}
