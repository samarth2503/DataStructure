package LeetcodeProblems;

public class ArmStrongNumber {

	public static void main(String[] args) {
		
		System.out.println(isArmStrongNum(125));
		System.out.println(reverseNum(4678));

	}
	
	public static boolean isArmStrongNum(int num)
	{
		int copyNum = num;
		
		if(num < 0)
		{
			return false;
		}
		
		if(num > 0 && num <9)
		{
			return true;
		}
		
		int sum = 0;
		int power = findPower(num);
		
		while(num != 0)
		{
			int rem = num%10;
			int factor = 1;
			for(int i=0;i<power;i++)
			{
				factor = factor * rem;
			}
			
			sum = sum + factor;
			num = num/10;
		}
		
		if(sum == copyNum)
			return true;
		
		return false;
	}
	
	public static int findPower(int num)
	{
		int count = 0;
		while(num != 0)
		{
			count++;
			num = num/10;
		}
		System.out.println("Count is "+count);
		
		return count;
	}
	
	public static int reverseNum(int num)
	{
		int copyNum = num;
		int rem = 0;
		int sum = 0;
		while(copyNum != 0)
		{
			rem = copyNum % 10;
			sum = (sum*10) + rem;
			copyNum = copyNum/10;
		}
		
		return sum;
	}

}
