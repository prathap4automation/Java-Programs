package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromStringList {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>(Arrays.asList("ram","sita","ram","hanuman","sita","test"));
		System.out.println("Before Removing duplicates:");
		for(String s:list)
		{
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println("After removing duplicates:");
		List<String> list2=list.stream().distinct().collect(Collectors.toList());
		list.clear();
		list.addAll(list2);
		for(String s:list) {
			System.out.print(s+" ");
		}
	}

}
