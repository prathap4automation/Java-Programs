package numbers;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers to check.");
		System.out.print("Enter x value :");
		int x=sc.nextInt();
		System.out.print("\nEnter y value :");
		int y=sc.nextInt();
		sc.close();
		//logic using third variable
		System.out.println("Swaping using third variable :");
		int temp=0;
		temp=x;
		x=y;
		y=temp;
		System.out.println("x value is :"+x+"\ny value is :"+y);
		//without using third variable.
		System.out.println("Swaping without using third variable :");
		x=x*y;
		y=x/y;
		x=x/y;
		System.out.println("value of x is :"+x+"\nValue of y is :"+y);
		
	}

}
