package strings;

import java.util.Scanner;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		System.out.println("Enter a string to check.");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		StringBuilder sb=new StringBuilder();
		char[] charArr=str.toCharArray();
		//logic
		for(Character c:charArr)
		{
			if(sb.indexOf(String.valueOf(c))!=-1)
				continue;
			else
				sb.append(c);
		}
		//printing
		System.out.println(sb.toString());
	}

}
