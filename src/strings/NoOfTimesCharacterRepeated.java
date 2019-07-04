package strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class NoOfTimesCharacterRepeated {

	public static void main(String[] args) {
		System.out.println("Enter a string to check.");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		System.out.println("Given string is: "+str);
		//convert string to char array
		char[] charArr=str.toCharArray();
		//create hash map and add char as key and its count as value
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(Character c: charArr)
		{
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c, 1);
		}
		//reading from hash map
		Set<Entry<Character, Integer>> set = map.entrySet();
		//printing the set content
		System.out.println(set);
		//iterating through each one and print only duplicate characters.
		for(Entry<Character, Integer> entry: map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+" repeated times "+entry.getValue());
			}
		}
	}

}
