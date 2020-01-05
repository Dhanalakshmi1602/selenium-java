package day5and6.Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDistintLetters {

	public static void main(String[] args) {
		Set<Character> unique = new LinkedHashSet<>();
		Set<Character> dups = new LinkedHashSet<>();
		String input = "Amazon India Private Limited";
		char[] tochar = input.toCharArray();
		for(char ch : tochar) {
			if(unique.contains(ch))
			{
				dups.add(ch);
			}
			else
			{
				unique.add(ch);
			}
		}
		for(char c : unique)
		{
			System.out.print(c);
		}

	}

}
