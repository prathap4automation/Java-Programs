/*
 * sum of divisors equals to given number
 * example: 6=1*2*3 
 */
package numbers.two;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number to check Perfect or not");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Given number is: "+n);
		System.out.println("Sum of divisors is: "+sum);
		if(n==sum)
			System.out.println(n+" Perfect number.");
		else
			System.out.println(n+" Not a Perfect number!!");
	}

}
