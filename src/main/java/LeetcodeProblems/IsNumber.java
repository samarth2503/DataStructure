package LeetcodeProblems;

public class IsNumber {

	public static void main(String[] args) {
		

	}
	
	public static boolean isCorrectPhoneNumber(String number)
	{
		return number.matches("[0-9]{10}");
	}
	
	public static boolean IsNumber(String number)
	{
		try {
			Long.parseLong(number);
		}
		catch(NumberFormatException e)
		{
			System.out.println("Not a avalid Number...");
			return false;
		}
		
		return true;
	}
	
	public static boolean isValidPhoneNumber(String number)
	{
		if(number.length() == 10 && IsNumber(number))
		{
			System.out.println("Phone number is valid...");
			return true;
		}
		
		System.out.println("Invalid Phone Number..");
		return false;
	}

}
