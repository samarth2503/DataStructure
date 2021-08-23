package SortingAlgoConcepts;

public class OrderAgnosticBinarySerach {

	public static void main(String[] args) {
		
		//int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
		int[] arr = {89,45,22,18,16,15,4,3,2,0,-4,-12,-18};
		int target = 18;
		System.out.println(orderAgnoistic(arr,target));
	}
	
	public static int orderAgnoistic(int[] arr,int target)
	{
		boolean isAsc = arr[0]<arr[arr.length-1];
		int low = 0;
		int high = arr.length-1;
		int mid =0;
		while(low<=high)
		{
			mid = low+(high-low)/2;
			
			if(arr[mid]==target)
			{
				return mid;
			}
			
			
			if(isAsc)
			{
				if(target<=arr[mid])
				{
					high = mid-1;
				}
				else {	
					low = mid+1;
				}
			}
			
			else {
				
				if(target>arr[mid])
				{
					high = mid-1;
				}
				else {	
					low = mid+1;
				}
			}
			
		}
		return -1;
	}

}
