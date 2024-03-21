package programs;

public class ManipulateStringRemoveCharacters {
	public static void main(String arg[]) {
	 String Str="f123jhewrfkjf%^$%-+nfedfm";
	 String remove = Str.replaceAll("[4fkj]", " ");
	 System.out.println("Manipulate characters " + remove);
	}
}
