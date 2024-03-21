package programs;

public class CountVowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="welcome to my world";
int vCount=0, cCount=0;
str=str.toLowerCase();
for(int i=0;i<str.length();i++)
{
	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
	{
		vCount++;
	}else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
	{
		cCount++;
	}
}
System.out.println("Count the number of vowels:" + vCount);
System.out.println("Count the number of Consonants:" + cCount);
   }                                                              
}
