package SortingAlgoConcepts;

public class PeakOfMountains {

	public static void main(String[] args) {
		
		int[] arr = {3,4,5,1};
		//int[] arr = {24,69,100,99,79,78,67,36,26,19};
		System.out.println(MountainPeak(arr));

	}
	
	public static int MountainPeak(int[] arr)
	{
		int low = 0;
        int high = arr.length-1;
        int mid = 0;
        
        if(arr.length==3)
        {
        	return 1;
        }
        
        while(low<=high)
        {
        	
            mid = low+(high-low)/2;
            
            if(mid<1)
            {
                break;
            }
            
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1])
            {
            	
                return mid;
            }
            
            if(arr[mid]<arr[mid-1])
            {
                high=mid+1;
            }
            
			if (arr[mid] < arr[mid + 1]) {
				low = mid;
			}
            
        }
        
        return -1;
        
	}

}
