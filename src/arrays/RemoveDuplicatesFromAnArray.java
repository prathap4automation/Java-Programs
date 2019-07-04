package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicatesFromAnArray {

	public static void main(String[] args) {
		String str[];
		str=new String[] {"prathap","ram","rahim","ram","sita","hanuman","sita"};
		List<String> list=new ArrayList<String>(Arrays.asList(str));
		System.out.println("Original List:");
		System.out.println("List size is:"+list.size());
		for(String s:list) {
			System.out.println(s);
		}
		//removing duplicated
		LinkedHashSet<String> l=new LinkedHashSet<>(list);
		//after removing again convert it into ArrayList
		list.clear();
		list.addAll(l);
		//printing
		System.out.println("\nAfter removing Duplicates:");
		System.out.println("List size is:"+list.size());
		for(String s:list)
		{
			System.out.println(s);
		}
	}

}
