package LeetcodeProblems;

public class PrintSubArrays {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		subArrays(arr);

	}
	
	public static void subArrays(int[] a)
	{
		for(int k=0;k<a.length;k++)
		{
			for(int i=k;i<a.length;i++)
			{
				for(int j=k;j<=i;j++)
				{
					System.out.print(a[j]);
				}
				System.out.println();
			}
		}
		
	}

}
