package strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class PrintDuplicateCharsCountInString {

	public static void main(String[] args) {
		System.out.print("Enter a string to check");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		sc.close();
		System.out.println("Given string is :"+str);
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		char[] charArr=str.toCharArray();
		//adding character and its count to hash map
		for(Character c:charArr)
		{
			if(map.containsKey(c))
				map.put(c, map.get(c)+1);
			else
				map.put(c, 1);
		}
		//printing the duplicates
		Iterator<Entry<Character,Integer>> i=map.entrySet().iterator();
		while(i.hasNext())
		{
			Map.Entry<Character,Integer> entry=(Map.Entry<Character,Integer>)i.next();
			if(((Integer)entry.getValue())>1)
				System.out.println(entry.getKey()+" char repeated times is :"+entry.getValue());
		}

		//finding highest repeated character. this will return the first highest.
		Map.Entry<Character, Integer> maxEntry = null;
		for (Map.Entry<Character, Integer> entry : map.entrySet())
		{
			if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0)
			{
				maxEntry = entry;
			}
		}
		System.out.println(maxEntry);
		//finding highest repeated character, this will return the last highest repeated character.
		char c=map.entrySet().stream().max((entry1,entry2)->entry1.getValue()>entry2.getValue()?1:-1).get().getKey();
		System.out.println("Highest repeated character is: "+c);
	}

}
