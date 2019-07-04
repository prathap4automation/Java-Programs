package strings;

public class ReverseEveryWordInString {

	public static void main(String[] args) {
		ReverseEveryWordInString rev=new ReverseEveryWordInString();
		String str="Welcome to Java";
		String strArr[]=str.split(" ");
		String revArr[]=new String[strArr.length];
		for(int i=0;i<strArr.length;i++) {
			revArr[i]=rev.reverseString(strArr[i]);
		}
		//printing
		System.out.println(String.join(" ", revArr));
	}
	
	String reverseString(String str)
	{
		StringBuilder sb=new StringBuilder();
		for(int i=str.length();i>0;i--) {
			char c=str.charAt(i-1);
			sb.append(c);
		}
		return sb.toString();
	}

}
