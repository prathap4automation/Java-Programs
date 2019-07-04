package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestNumberr {
	public static void main(String[] args) {
		int arr[] = {13, 7, 6, 45, 21, 9, 101, 102};
		System.out.println("Before sorting:");
		for(Integer a:arr) {
	    	System.out.println(a);
	    }
		Arrays.sort(arr);
	    System.out.println("After sorting");
	    for(Integer a:arr) {
	    	System.out.println(a);
	    }
	    List<Integer> list=new ArrayList<Integer>();
	    for(Integer a:arr) {
		    list.add(a);	
	    }
	    System.out.println("Highest number is:"+list.get(arr.length-1));
	}
	

}
