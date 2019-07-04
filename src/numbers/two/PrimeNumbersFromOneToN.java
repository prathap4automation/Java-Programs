package numbers.two;

import java.util.Scanner;

public class PrimeNumbersFromOneToN {
	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		int n=0;
		restart:while(true) {
			System.out.println("Enter a range to check:");
			n=sc.nextInt();
			if(n<2)
			{
				System.out.println("Prime number starts from 2");
				continue restart;
			}
			break restart;
		}
		System.out.println("Prime numbers are:");
		for(int i=2;i<=n;i++)
		{
			int flag=0;
			for(int j=i-1;j>=2;j--)
			{
				if(i%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(i+" ");
			}
		}
	}
}
