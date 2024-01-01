package LeetcodeProblems;

public class StaticBlockConcept {

	public static void main(String[] args) {
		
		System.out.println(Main.x);				// Ans is 10 because final variable is used and 10 will be printed, If we remove final then static block will b executed first

	}

}

class Main
{
	public static final int x = 10;
	
	static {
		System.out.println("MAin -class Staic block");
	}
}
