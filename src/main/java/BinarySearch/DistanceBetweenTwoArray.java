package BinarySearch;

public class DistanceBetweenTwoArray {

	public static void main(String[] args) {
		
		int[] arr1 = {1,4,2,3};
		int[] arr2 = {-4,-3,6,10,20,30};
		System.out.println(distanceArray(arr1,arr2,3));

	}
	
	public static int distanceArray(int[] arr1,int[] arr2,int d)
	{
		int diff = 0;
        
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2.length;j++)
            {
                diff=Math.abs((arr1[i])-(arr2[j]));
                
                if(diff<=d)
                {
                    diff=i;
                    break;
                }
            }
        }
        return diff;
	}

}
