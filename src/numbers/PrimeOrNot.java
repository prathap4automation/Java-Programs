package numbers;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check prime or not");
		int num=sc.nextInt();
		sc.close();
		int flag=0;
		//logic
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println(num+" is not a prime number!!");
		else
			System.out.println(num+" ia a Prime number.");
	}

}
