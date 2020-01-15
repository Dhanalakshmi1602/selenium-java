package day5and6.Assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintSecondMostRepeatingChar {

	public static void main(String[] args) {
		Map<Character,Integer> map = new HashMap<>();
		String  input = "PayPal India";
		char[] tochar = input.toCharArray();
		for (char eachchar : tochar) 
		{
			if(map.containsKey(eachchar))
			{
				map.put(eachchar ,map.get(eachchar) + 1);
			}
			else
			{
				map.put(eachchar , 1);
			}
		}
		for (char c : map.keySet())
		{
			System.out.println(c + " = " + map.get(c) );
			
		}
		List<Integer> list = new ArrayList(map.values());
		Collections.sort(list);
		System.out.println("second highest count = " + list.get(list.size() - 2));
		int secondHighestValues = list.get(list.size() - 2);
		for (char c : map.keySet())
		{
			if(map.get(c) == secondHighestValues)
			{
				System.out.println("Char that appears second most times = " + c);
			}
			
		}
	}

}
