package LeetcodeProblems;

public class StaticBlockQuestion2 {
	
	static int age = 20;
	
	static {
		System.out.println("Static 1");
	}
	
	static {
		System.out.println("Static 2");
	}
	
	static {
		System.out.println("Static 3");
	}

}
