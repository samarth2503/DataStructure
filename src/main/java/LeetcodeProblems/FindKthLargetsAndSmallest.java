package LeetcodeProblems;

public class FindKthLargetsAndSmallest {

	public static void main(String[] args) {
		
		int[] a = {5,8,12,7,6,2,4};
		int k = 1;
		findElement(a,k);

	}
	
	public static void findElement(int[] a, int k)
	{	
		for(int i=0;i<a.length;i++)
		{
			for(int j = (i+1);j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				
				
				
			}
			if(i==(k-1))
			{
				System.out.println("Kth largest element is "+a[i]);
				break;
			}
			
			
			
		}
	}

}
