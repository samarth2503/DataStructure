package SortingAlgoConcepts;

public class PeakOfElement {

	public static void main(String[] args) {
		
		int[] nums = {6,5,4,3,2,3,2};
		System.out.println(findPeakElement(nums));
	}
	
	public static int findPeakElement(int[] arr) {
        
		int low = 0;
        int high = arr.length-1;
        int mid = 0;
        int lowLimit = Integer.MIN_VALUE;
        
        if(arr.length==1)
        {
        	return 0;
        }
        
        while(low<=high)
        {
        	
            mid = low+(high-low)/2;
            
            if(mid==0)
            {
                if(arr[mid]>arr[mid+1])
                {
                    return 0;
                }
                else
                {
                    return 1;
                }
            }
            
            if(mid==arr.length-1)
            {
                if(arr[mid]<arr[mid-1])
                {
                    return mid-1;
                }
                else{
                    return mid;
                }
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
