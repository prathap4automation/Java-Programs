package numbers;

public class SortAnIntegerArray {

	public static void main(String[] args) {
		int[] arr= {22,4,13,56,78,87,89};
		int temp=0;
		System.out.println("Before sorting:");
		for(Integer a: arr) {
			System.out.println(a);
		}
		//logic
		for(int i=1;i<arr.length;i++)
		{
			for(int j=i;j>0;j--) 
			{
				if(arr[j] < arr[j-1]) {
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
		//printing
		System.out.println("After sorting:");
		for(Integer a: arr) {
			System.out.println(a);
		}
	}

}
