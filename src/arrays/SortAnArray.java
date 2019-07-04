package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortAnArray {

	public static void main(String[] args) {
		//create an array
		String str[]; 
		str=new String[]{"one","two","three","four","five"};
		System.out.println("Before sorting:");
		for(String s:str)
		{
			System.out.println(s);
		}
		System.out.println("After sorting:");
		List<String> list=new ArrayList<String>(Arrays.asList(str));
		Collections.sort(list);
		for(String s:list) {
			System.out.println(s);
		}
		System.out.println("After sorting in reverse order:");
		List<String> list2=new ArrayList<String>(Arrays.asList(str));
		Collections.sort(list2,Collections.reverseOrder());
		for(String s:list2) {
			System.out.println(s);
		}
	}

}
