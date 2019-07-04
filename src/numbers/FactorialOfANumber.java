/*
 5!=5*4*3*2*1=120
 */
package numbers;

import java.util.Scanner;

public class FactorialOfANumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to find factorial value.");
		int num=sc.nextInt();
		int factVal = 1;
		sc.close();
		//logic
		for(int i=num;i>=1;i--)
		{
			factVal=factVal*i;
		}
		System.out.println(factVal);
	}

}
