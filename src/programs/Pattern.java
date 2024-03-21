package programs;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int alphabet=65;
		for(i=0;i<4;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print((char) (alphabet+j)+ " ");
				//System.out.print((char) alphabet+ " ");
				//System.out.print("*");
				
			}
			alphabet++;
			System.out.println();
		}

	}

}
