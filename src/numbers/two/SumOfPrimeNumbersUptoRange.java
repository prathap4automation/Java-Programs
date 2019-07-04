package numbers.two;

import java.util.Scanner;

public class SumOfPrimeNumbersUptoRange {

	public static void main(String[] args) {
		SumOfPrimeNumbersUptoRange s=new SumOfPrimeNumbersUptoRange();
		int range=0,sum=0;
		restart:while(true) {
			Scanner sc=new Scanner(System.in);
			range=sc.nextInt();
			sc.close();
			if(range<2) {
				System.out.println("Prime numbers starts from 2!!");
				continue restart;
			}
			break restart;
		}
		//logic
		System.out.println("Sum of prime numbers are");
		for(int i=2;i<=range;i++)
		{
			
			if(s.isPrime(i))
			{
				System.out.print(i+"+");
				sum=sum+i;
			}
		}
		System.out.println("\n"+sum);
	}
	
	boolean isPrime(int n)
	{
		int flag=0;
		if(n>2) { System.out.println("Prime number starts from 2!!");}
		for(int i=2;i<n;i++)
		{
			if(n%i==0) {
				flag=1;
				break;
			}
		}
		if(flag==1)
			return false;
		else 
			return true;
	}

}
