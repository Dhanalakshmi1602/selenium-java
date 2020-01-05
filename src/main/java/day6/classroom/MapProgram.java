package day6.classroom;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
		String name = "Dhanalakshmi";
		char[] str = name.toCharArray();
		Map<Character,Integer> map = new HashMap<>();
		int count = 1;
		for (char c : str)
		{
		if(map.containsKey(c))
		{			
			map.put(c,map.get(c)+1);
		}
		else
		{		
			map.put(c, count);
		}
					
		}
		System.out.println(map);
	}

}
