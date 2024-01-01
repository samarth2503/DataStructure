package Mathdsa;

public class NewtonRaphsonMethod {

	public static void main(String[] args) {
		
		//System.out.println(recursion(11,0,31));
		System.out.println(countingBits(5));
		String a = "1010";
		String b = "1011";
		
		System.out.println(hammingDistance(93,73));
		
		int[] nums= {1};
		//System.out.println(singleNumber(nums));
	
		//System.out.println(convertToBinary(4));
		System.out.println(addBinary(a,b));
	}
	
	public static String addBinary(String a, String b) {
        
		 StringBuilder sb=new StringBuilder();
	     int i=a.length()-1;
	     int j=b.length()-1;
	        int carry=0;
	     while(i>=0||j>=0||carry!=0)
	     {
	      int x=(i<0)?0:a.charAt(i)-'0';
	      int y=(j<0)?0:b.charAt(j)-'0';
	      int sum=x+y+carry;
	      sb.append(sum%2);
	      carry=sum/2;
	      i--;
	      j--;
	     }
	     sb=sb.reverse();
	     return sb.toString();
    }
	
	public static int hammingDistance(int x, int y) {
        
        int count = 0;
        for(int i=0;i<32;i++)
        {
            int a = (x>>i)&1;
            int b = (y>>i)&1;
            
            if(a!=b)
            {
                count++;
            }
        }
        
        return count;
        
    }
	
	public static int countingBits(int n)
	{
		int count = 0;

        while (n>0){

            n = n&(n-1);
        
            count++;
        }

        return count;
	}

}
