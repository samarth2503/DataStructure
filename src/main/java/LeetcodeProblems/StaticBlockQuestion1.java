package LeetcodeProblems;

public class StaticBlockQuestion1 {
	
	// How to create Object if we make Constructor as Private 
	// This can be achieved by using public layer 
	
	int age;
	
	private StaticBlockQuestion1()
	{
		this.age = 10;
	}
	
	// public layer method to acess private constructor
	public static StaticBlockQuestion1 createObject()
	{
		StaticBlockQuestion1 obj = new StaticBlockQuestion1();
		return obj;
	}

	public static void main(String[] args) {
		
		StaticBlockQuestion1 obj = new StaticBlockQuestion1();
		System.out.println(obj.age);
	}

}
