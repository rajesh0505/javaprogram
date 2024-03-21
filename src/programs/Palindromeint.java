package programs;

public class Palindromeint {
	public static void main(String arg[])
	{
	int r,num=646,reversnum=0;
	int orginalnum =num;
	
	while(num!=0)
	{
	r=num%10;
	reversnum=(reversnum*10)+r;
	num/=10;
	
	}
if(orginalnum==reversnum)
{
	System.out.println(orginalnum + " it is a palindrome");
	
}
else {
	System.out.println(orginalnum+ " it is not a palindrome");
}

}
}