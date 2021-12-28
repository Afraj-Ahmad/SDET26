package javaPractice;

import java.util.LinkedHashSet;

public class RemoveDuplicate {
public static void main(String[] args) {
		
		String s = "india";
		
		/*Step-1 Create any set collection and add all the char of given string into SET*/
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i = 0; i<s.length(); i++) {
			
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			System.out.print(ch);
		}
		
	}
}
