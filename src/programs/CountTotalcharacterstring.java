package programs;

public class CountTotalcharacterstring {
	public static void main(String arg[])
	{
		String str="welc2ome to # my wo565rld";
		int count = 0;
		String test = str.replaceAll("\\s", "");
		 int total=str.length();
		 System.out.println("Orginal String Length:"+ total);
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!= ' ')
			{
				count++;
				
			}
		}
		System.out.println("total count characters: " + count);
	}

}



