package linkedList;

import java.util.LinkedList;
import java.util.List;

import linkedList.Utility;

public class AddElement {

	public static void main(String[] args) {
		Utility u=new Utility();
		LinkedList<String> list=(LinkedList<String>) u.list();
		//printing list
		System.out.println("printing list");
		for(String str:list) {
			System.out.println(str);
		}
		//adding element at index 2
		list.add(2, "prathap");
		//printing after adding at index 2
		System.out.println("printing after adding at index 2");
		for(String str:list) {
			System.out.println(str);
		}
		System.out.println("Adding elemnt at bening of index:");
		list.addFirst("mallipeddi");
		for(String str:list) {
			System.out.println(str);
		}
		System.out.println("Adding elemnt at end of index:");
		list.addLast("Chowdary");
		for(String str:list) {
			System.out.println(str);
		}
		System.out.println("Getting sublist:");
		List<String> list3=list.subList(2, 5);
		for(String str:list3) {
			System.out.println(str);
		}
		//search
		System.out.println("Search Element \"chowdary\":");		
		System.out.println(list.indexOf("Chowdary"));
		System.out.println(list.lastIndexOf("Chowdary"));
	}

}
