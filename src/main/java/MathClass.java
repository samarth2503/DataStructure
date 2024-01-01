
public class MathClass {

	public static void main(String[] args) {
	
		System.out.println(reverseBits(43261596));
		
		int n = 7;
		System.out.println(n+" is "+findEvenOdd(n));
		setIthBit(94);
		
		resetIthBit(86);
		findMagicNumber(6);
		findNoOfDigit(6,2);
		findNumberPowerOfTwo(8);
		findPowerOfNumber(3,6);
		findithBit(182,5);
		//System.out.println("Is 13 a Prime Number "+isPrime(20));
		int a = 3;
		int b = 9;
		System.out.println("Xor for "+a+" to "+b +" is "+(findXORforRange(a-1)^findXORforRange(b)));
		System.out.println(n^0);
		int arr[] = {-2,3,2,4,-5,5,-4};
		int num[] = {2,3,4,1,2,3,1,6,4,6,7,8,7,9,9};
		System.out.println("Positive Number is "+findPositiveNum(arr));
		System.out.println("Distinct Number is "+findDistinct(num));
		
		System.out.println(n&1);

	}
	
	public static int findPositiveNum(int[] num)
	{
		int sum = 0;
		for(int i=0;i<num.length;i++)
		{
			sum+=num[i];
		}
		
		return sum;
	}
	
	public static int findDistinct(int[] num)
	{
		
		int res = 0;
		for(int i=0;i<num.length;i++)
		{
			res = res ^ num[i];
		}
		return res;
	}
	
	public static void findMagicNumber(int n)
	{
		int base = 5;
		int ans = 0;
		while(n>0)
		{
			int last = n&1;
			n = n>>1;
			ans+=last*base;
			base = base*5;	
		}
		
		System.out.println(ans);
	}
	
	public static void findNoOfDigit(int n,int b)
	{
		int ans = 0;
		
		ans = (int)(Math.log(n)/Math.log(b)) + 1;
		
		System.out.println("No of digit for "+n+" in base "+b+" is "+ans);
	}
	
	public static void findNumberPowerOfTwo(int n)
	{
		/****************** 1st Method *******************/
		
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
		
		if(count==1)
		{
			System.out.println("Number is power of 2");
		}
		else {
			System.out.println("Number is not power of 2");
		}
		
		/*************** 2nd Method **************/
		
		int i = n&(n-1);
		
		if(i==0)
		{
			System.out.println("Number is power of Two");
		}
		else
		{
			System.out.println("Number is not power of Two");
		}
	}
	
	public static void findPowerOfNumber(int n, int b)
	{
		int ans = 1;
		int base = n;
		while(b>0)
		{
			int last = b&1;
			if(last==1)
			{
				ans*=base;
			}
			b = b>>1;
			base = base*base;
		}
		
		System.out.println("Answer is "+ans);
	}
	
	public static int findXORforRange(int a)
	{
		if(a%4 == 0)
		{
			return a;
		}
		
		if(a%4 == 1)
		{
			return 1;
		}
		
		if(a%4 == 2)
		{
			return a+1;
		}
		
		return 0;
	}
	
	public static void findithBit(int n,int bit)
	{
		int k = 1;
		k = k<<4;
		System.out.println(bit +"th is "+(n&(k)));
	}
	
	public static void setIthBit(int n)
	{
		int k = 1;
		
		k=k<<3;
		
		System.out.println(n|(k));
	}
	
	public static void resetIthBit(int n)
	{
		int k = 1;
		
		k=~(k<<4);
		System.out.println("K is "+k);
		System.out.println(n&k);
	}
	
	public static String findEvenOdd(int n)
	{
		if((n&1)==0)
		{
			return "Even";
		}
		
		return "Odd";
	}
	
	public static int reverseBits(int n) {
        
	      int res = 0;
	        
	        //creating a mask to match the msb with the input
	        //mask -> 10000000000000000000000000000000
	        
	        int match = 1<<31;
	        
	        for(int i=0;i<32;i++){
	            //doing & and chcking if msb is not zero
	            //shift the result to ith left
	        	int a = n&match;
	            if((n&match)!=0){
	                res += 1<<i;
	            }
	            n = n<<1;
	        }
	        
	        return res;
	        
	    }

}
