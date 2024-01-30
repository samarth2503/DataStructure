package LeetcodeProblems;

public class FirstAndLastPoistionSortedarray {

	public static void main(String[] args) {
		
		int[] arr = {1,4,7,8,11,11,11,11,12,13};
		findFirstLastElemen(arr,11);

	}
	
	public static void findFirstLastElemen(int[] arr,int target)
	{
		int first = -1;
		int last = -1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				first = i;
				break;
			}
		}
		
		for(int j=first;j<arr.length;j++)
		{
			if(arr[j]!=target)
			{
				last = j-1;
				break;
			}
		}
		
		System.out.println(first+" , "+last);
	}

}
