package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromList {
	static List<Integer> intList;
	public static void main(String[] args) {
		intList=new ArrayList<Integer>(Arrays.asList(0,1,2,2,3,4,5,5,6));
		System.out.println("Before Sorting:");
		for(Integer i:intList)
		{
			System.out.print(i+" ");
		}
		System.out.println("\nAfter Sorting:");
		/*
		 * way 1 using distinct()
		 */
		System.out.println("Using distinct:");
		intList=new ArrayList<Integer>(Arrays.asList(0,1,2,2,3,4,5,5,6));
		List<Integer> list1=intList.stream().distinct().collect(Collectors.toList());//removing duplicates
		intList.clear();
		intList.addAll(list1);
		for(Integer i: intList) {
			System.out.print(i+" ");
		}
		System.out.println();
		/*
		 * way 2: using LinkedHashSet removing duplicates
		 */
		System.out.println("Using LinkedHashSet:");
		intList=new ArrayList<Integer>(Arrays.asList(0,1,2,2,3,4,5,5,6));
		Set<Integer> list2=new LinkedHashSet<Integer>(intList);//removing duplicates
		intList.clear();
		intList.addAll(list2);
		for(Integer i : list2) {
			System.out.print(i+" ");
		}
		System.out.println();
		/*
		 * way-3 using new List
		 */
		System.out.println("Using new List with element checking:");
		intList=new ArrayList<Integer>(Arrays.asList(0,1,2,2,3,4,5,5,6));
		List<Integer> list3=new ArrayList<Integer>();
		for(Integer i: intList)//removing duplicates
		{
			if(!list3.contains(i))
			{
				list3.add(i);
			}
		}
		intList.clear();
		intList.addAll(list3);
		for(Integer i: intList)//printing list
		{
			System.out.print(i+" ");
		}
		System.out.println();
	}

}
