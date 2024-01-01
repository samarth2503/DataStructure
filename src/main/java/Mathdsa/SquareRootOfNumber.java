package Mathdsa;

public class SquareRootOfNumber {

	public static void main(String[] args) {
		
		int n = 40;
		
		System.out.println(findBinary(n,3));
	}
	
	public static double findBinary(int n,int p)
	{
		int start = 0;
		int end = n;
		int mid = 0;
		double root = 0.01;
		double incr = 0.1;
		
		while(start< end)
		{
			mid = start + (end-start)/2;
			
			if(mid*mid == n)
			{
				return mid;
			}
			
			if(mid*mid > n)
			{
				end = mid-1;
			}
			else
			{
				start = mid;
			}
		}
		
		for(int i=0;i<p;i++)
		{
			while(root*root<=n)
			{
				root+=incr;
			}
			
			root-=incr;
			incr /= 10;
		}
		
		return root;
	}

}
