package programs;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-gnerated method stub
		int Number=17;
		if(isPrime(Number))
		{
			System.out.println(Number+" is a Prime Number");
		}
		else
		{
			System.out.println(Number+" is Not a Prime Number");
		}
		
	}
	
	public static boolean isPrime(int Number)
	{
		boolean isNumber=true;
		for(int i=2;i<Number;i++)
		{
			if(Number%i==0)
			{
				isNumber=false;
			}
		}
		return isNumber;
	}

}
