package day5and6.Assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetRemoveDups {

	public static void main(String[] args) 
	{
		Set<Character> nameSet = new LinkedHashSet<>();
		Set<Character> duplicates = new LinkedHashSet<>();
		String name = "PayPal India";
		char[] namearray = name.toCharArray();
		for (char eachchar : namearray) 
		{
			if(nameSet.contains(eachchar))
			{
				duplicates.add(eachchar);
			}
			else
			{
				nameSet.add(eachchar);	
			}
		}
		for(Character ch:duplicates)
		{
			nameSet.remove(ch);
		}
		for(Character ch:nameSet)
		{
			System.out.print(ch);
		}
	}
}