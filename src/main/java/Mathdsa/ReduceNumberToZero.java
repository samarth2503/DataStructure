package Mathdsa;

public class ReduceNumberToZero {

	public static void main(String[] args) {
		
		System.out.println(findZero(14));
	}
	
	public static int findZero(int num)
	{
		int count = 0;
        num = num>>0;
        while(num>0)
        {
            if((num&1)==0)
            {
                count++;
                num=num>>1;
            }
            else
            {
                num = num^1;
                count++;
            }
            
            
        }
        
        return count;
	}

}
