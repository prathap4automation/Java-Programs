package pattren;

import java.util.Scanner;

public class PyramidReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range.");
		int range=sc.nextInt();
		sc.close();
		//logic
		for(int i=range;i>=1;i--)
		{
			for(int j=range-i;j>0;j--)
			{	System.out.print(" "); 		}
			for(int j=0;j<i;j++)
			{	System.out.print("* "); 	}
			System.out.println();
		}
	}

}
