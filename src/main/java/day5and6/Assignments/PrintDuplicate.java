package day5and6.Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicate {

	public static void main(String[] args) {
		Set<Character> unique = new LinkedHashSet<>();
		Set<Character> duplicate = new LinkedHashSet<>();
		String input = "Infosys Limited";
		char[] tochar = input.toCharArray();
		for(char c : tochar)
		{
			if(unique.contains(c))
			{
				duplicate.add(c);
			}
			else
			{
				unique.add(c);
			}
		}
		for(char c : duplicate) {
			System.out.println(c);
		}
		

	}

}
