package programs;

public class LagestNumberanArray {
	public static void main(String arg[]) {
	int[] arr=new int[] {25,17,19,89,89,155};
	int max=arr[0];
	int max1=arr[0];
	for(int i=0; i<arr.length; i++)
	{
		//it display the smallerst number an arry will change symble is '<' to '>'
		if(arr[i]<max)
		{
			max1=max;
			max=arr[i];
		}else if(arr[i]<max1)
		{
			max1=arr[i];
		}
	}
//	System.out.println("First largest number an array:"+ max);
//	System.out.println("Second largest number an array:"+ max1);
	
	System.out.println("First Smallest number an array:"+ max);
	System.out.println("Second Smallest number an array:"+ max1);
	}
}
