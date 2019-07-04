package collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		//creating a array list
		ArrayList<String> list=new ArrayList<String>();
		ArrayList<String> list2=new ArrayList<String>();
		//adding elements to first list
		list.add("prathap");
		list.add("mallipeddi");
		list.add("chakraipalem");
		list.add("addanki");
		//reading from array list
		System.out.println("Printing list data :");
		System.out.println("=============================================================");
		for(String str:list)
		{
			System.out.println(str);
		}
		//adding at specific position
		System.out.println("Printing list data after adding element at 3rd position:");
		System.out.println("=============================================================");
		list.add(2, "prakasam district");
		for(String str:list)
		{
			System.out.println(str);
		}
		//removing second element based on index
		System.out.println("Printing list data after deleting 2nd element :");
		System.out.println("=============================================================");
		list.remove(1);
		for(String str:list)
		{
			System.out.println(str);
		}
		//removing based on element data
		list.remove("addanki");
		System.out.println("Printing list data after deleting based on element data :");
		System.out.println("=============================================================");
		for(String str:list)
		{
			System.out.println(str);
		}
		//adding elements to second list
		list2.add("abc");
		list2.add("xyz");
		list2.add("qwerty");
		System.out.println("Printing list 2 data after adding:");
		System.out.println("=============================================================");
		for(String str:list2)
		{
			System.out.println(str);
		}
		//adding list2 to list one
		list.addAll(2, list2);
		System.out.println("Printing list 2 data after adding another list at particular index 1:");
		System.out.println("=============================================================");
		for(String str:list)
		{
			System.out.println(str);
		}
	}

}
