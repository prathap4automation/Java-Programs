package numbers.two;

public class SumOfOneToN {

	public static void main(String[] args) {
		int n=15,sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
			System.out.print(i+"+");
		}
		System.out.println(":"+sum);
	}

}
