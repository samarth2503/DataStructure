package SortingAlgoConcepts;


public class FirstBadVersionProblem {

	public static void main(String[] args) {
		
		System.out.println(squareRoot(808201));
	
	}
	
	public static boolean squareRoot(int num)
	{
		int sum =0;
        while(num!=0)
        {
            int div = num%10;
            sum+=div;
            num=num/10;
        }
        
        return sumUpDigit(sum);
	}
	
	public static boolean sumUpDigit(int num)
	{
		int sum =0;
		while(num!=0)
        {
            int div = num%10;
            sum+=div;
            num=num/10;
        }
		
		if(sum==1 || sum==4 ||sum==7 || sum==9 || sum==10 || sum==100)
        {
            return true;
        }
        
        return false;
	}
	
	
}
