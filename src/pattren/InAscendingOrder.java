package pattren;

import java.util.Scanner;

public class InAscendingOrder {
	public static void main(String[] args)
	{
		System.out.println("Enter the range.");
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		sc.close();
		System.out.println("Given range is "+range);
		for(int i=1;i<=range;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
