package Mathdsa;

public class SetBitBinrayRep {

	public static void main(String[] args) {
		
		int left = 10;
		int right = 15;
		
		int count = 0;
        int x = 0;
        while(left<=right)
        {
            x = movingBit(left);
            
            if(primeNumber(x))
            {
                count++;
            }
            left++;
        }
        
        System.out.println(count);

	}
	
	public static int movingBit(int n)
    {
//        int count = 0;
//        while(n>0)
//        {
//            if((n&1)==1)
//            {
//                count++;
//            }
//            n = n>>1;
//        }
//        
//        return count;
		
        int count = 0;
		while(n>0)
		{
			int last = n&1;
			if(last==1)
			{
				count++;
			}
			n = n>>1;
		}
		
		return count;
    }
    
    public static boolean primeNumber(int n)
    {
        if(n<=1)
        {
            return false;
        }
        
        int c = 2;
        
        while(c*c <=n)
        {
            if(n%c==0)
            {
                return false;
            }
            
            c++;
        }
        
        return true;
    }

}
