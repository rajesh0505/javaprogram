package programs;

public class ReverseofString {
	public static void main(String arg[])
	{
	String str="rajesh pokala";
	String reversestr=" ";
	//String spaces =str.replaceAll("\\s","");
	int obj=str.length();
	System.out.println("total string lengths: "+obj);
	for(int i=0;i<str.length();i++)
	{
		reversestr=str.charAt(i)+reversestr;
	}
	System.out.println("reverse of string: " + reversestr);
	}
}
