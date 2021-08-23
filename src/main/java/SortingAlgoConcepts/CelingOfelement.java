package SortingAlgoConcepts;

public class CelingOfelement {

	public static void main(String[] args) {
		
		int[] arr = {2,3,5,9,14,16,18};
		int target = 7;
		System.out.println(celing(arr,target));
	}
	
	public static int celing(int[] arr,int target)
	{
		int low = 0;
		int high = arr.length-1;
		int mid = 0;
		while(low<=high)
		{
			mid = low + (high-low)/2;
			
			if(arr[mid]==target)
			{
				return arr[mid];
			}
			
			if(target>arr[mid])
			{
				low = mid+1;
			}
			
			if(target<arr[mid])
			{
				high = mid-1;
			}
		}
		

		//return arr[high];       // For floor of number
		return arr[low];			// For Celing of number                           
	}

}
