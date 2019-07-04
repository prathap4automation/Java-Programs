package strings;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		System.out.println("Enter a string to check palindrome or not.");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		String orgStr=str;
		StringBuilder sb=new StringBuilder();
		for(int i=str.length();i>0;i--)
		{
			char c=str.charAt(i-1);
			sb.append(c);
		}
		if(orgStr.equals(sb.toString()))
			System.out.println("Given Sting is palindrome.");
		else
			System.out.println("Given string is not a palindrome!");
	}

}
