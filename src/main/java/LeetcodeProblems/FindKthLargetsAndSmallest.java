package LeetcodeProblems;

public class FindKthLargetsAndSmallest {

	public static void main(String[] args) {
		
		int[] a = {5,8,4,7,6,2,12};
		int k = 5;
		findElement(a,k);

	}
	
	public static void findElement(int[] a, int k)
	{	
		for(int i=0;i<(a.length-1);i++)
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
				System.out.println(a[k-1]);
				break;
			}
		}
	
	}

}
