package day1.classroom;

import java.util.Arrays;

public class Dupliate {

	public static void main(String[] args) {
		int[] num = {1,3,4,8,6,4,9,8,7};
		Arrays.sort(num);
		for (int i = 0; i< num.length-1; i++) {
			if(num[i] == num[i+1])
			{
				System.out.println(num[i] + "  is aDuplicate number");
			}
			
		}
			

	}

}
