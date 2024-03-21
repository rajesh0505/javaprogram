package programs;

public class Factorial {
	public static void main(String arg[])
	{
	int num=4;
	long fact=1;
	for(int i=1;i<=num;i++)
	{
		fact=fact*i;
	}
	System.out.print("factorial of " + num +" is " + fact);
	}

}
