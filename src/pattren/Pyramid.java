package pattren;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size.");
		int size=sc.nextInt();
		sc.close();
		//logic
		for(int i=0;i<size;i++)
		{
			for(int j=size-i;j>1;j--)
			{	System.out.print("_"); 	}
			for(int j=0;j<=i;j++)
			{	System.out.print("*_"); 	}
			System.out.println();
		}
		
		
	}

}
