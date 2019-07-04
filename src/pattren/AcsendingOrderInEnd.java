/*
         *
       * *
     * * *
   * * * *
 * * * * *
 
 */
package pattren;

import java.util.Scanner;

public class AcsendingOrderInEnd {

	public static void main(String[] args) {
		System.out.println("Enter range.");
		Scanner sc=new Scanner(System.in);
		int range=sc.nextInt();
		sc.close();
		int count=1;
		//logic
//		for(int i=range;i>=1;i--) 
//		{
//			for(int j=i;j>1;j--)
//			{
//				System.out.print("  ");
//			}
//			for(int k=0;k<count;k++)
//			{
//				System.out.print(" *");
//			}
//			System.out.println();
//			count++;
//		}
		//logic-2
		for(int i=1;i<=range;i++)
		{
			for(int j=range;j>i;j--)
			{ System.out.print("  "); }
			for(int k=0;k<i;k++)
			{ System.out.print(" *"); }
			System.out.println();
		}
	}

}
