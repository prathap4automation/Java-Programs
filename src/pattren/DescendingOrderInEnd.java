/*
 * * * * *
   * * * *
     * * *
       * *
         *
 */
package pattren;

import java.util.Scanner;

public class DescendingOrderInEnd {

	public static void main(String[] args) {
		System.out.println("Enter range.");
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		//logic
		for(int i=1;i<=range;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print("  ");
			}
			for(int k=range;k>=i;k--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		sc.close();
	}

}
