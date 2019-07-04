package pattren;

import java.util.Scanner;

public class InDescendingOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Range.");
		int range=sc.nextInt();
		sc.close();
		System.out.println("Given range is :"+range);
		//logic-1
		for(int i=range;i>=1;i--)
		{
			for(int j=i;j>0;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		//logic 2
		for(int i=0;i<=range;i++)
		{
			for(int j=range;j>i;j--)
			{ System.out.print("* ");}
			System.out.println();
		}
		//logic 3
		for(int i=range;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
