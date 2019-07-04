package strings;

public class RemoveSpecifiedCharacterFromString {

	public static void main(String[] args) {
		/*
		 * Remove all spaces from below string 
		 */
		String str="this is my input string";
		System.out.println("Given String: "+str);
		System.out.println("modified String: "+str.replaceAll(" ", ""));
	}

}
