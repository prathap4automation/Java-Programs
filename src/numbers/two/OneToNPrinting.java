package numbers.two;

public class OneToNPrinting {

	public static void main(String[] args) {
		int n=20;
		//print from 1 to n
		System.out.println("Printing from 1 to n");
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println("\nPrinting from n to 1");
		for(int i=n;i>0;i--) {
			System.out.print(i+" ");
		}
	}

}
