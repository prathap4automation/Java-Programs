package StringMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Join {

	public static void main(String[] args) {
		List<String> list=
				new ArrayList<String>(Arrays.asList("prathap","kishore","praveen","jagga"));
		System.out.println(String.join(",", list.toArray(new String[0])));//converts list to string array and joins
		System.out.println(String.join(",", list.stream().toArray(String[]::new)));
		System.out.println(String.join(",", "abc","bcd","cde","def"));
	}

}
