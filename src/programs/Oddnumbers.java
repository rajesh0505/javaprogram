package programs;

public class Oddnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {3,4,6,35,754,19,7,89};
System.out.println("print odd numbers");
for(int i=1;i<num.length;i++)
{
	if(i%2!=0)
	{
		System.out.println(i);
	}
}
System.out.println("print even numbers");
for(int i=1;i<num.length;i++)
{
	if(i%2==0)
	{
		System.out.print(i);
	}
}
	}

}
