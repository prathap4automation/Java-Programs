package numbers;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to reserve check.");
		int num=sc.nextInt();
		sc.close();
		int rev=0;
		while(num!=0)
		{
			rev=(rev*10)+(num%10);
			num/=10;
		}
		System.out.println("After reversing a number :"+rev);
	}

}
