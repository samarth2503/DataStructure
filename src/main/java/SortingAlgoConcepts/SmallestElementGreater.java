package SortingAlgoConcepts;

public class SmallestElementGreater {

	public static void main(String[] args) {
		
		char[] letters = {'c','f','j'};
		char target = 'j';
		System.out.print(nextGreatestChar(letters,target));
	}
	
	public static char nextGreatestChar(char[] letters,char target)
	{
		if(target=='z')
        {
            return 'a';
        }
        
        int low = 0;
        int high = letters.length-1;
        int mid = 0;
        while(low<high)
        {
        	mid = low + (high-low)/2;
        	
        	if(letters[mid]>target)
            {
                high = mid;
            }
        	else {
        		low=mid+1;
        	}
        	
        }

        return letters[high];	
	}

}
