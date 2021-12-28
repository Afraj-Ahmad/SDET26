package javaPractice;

import java.util.LinkedHashSet;

public class DuplicateCharacter {
	public static void main(String[] args) {
		
		String s = "nayana";
		
		/*Step-1 Create any set collection and add all the char of given string into SET*/
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for(int i = 0; i<s.length(); i++) {
			
			set.add(s.charAt(i));
		}
		//System.out.println(set);
		
		for (Character ch : set) { 
			int count = 0;
		/*Step 2 -  compare each char of set with all the char of given string*/
			for(int i = 0; i<s.length(); i++) {
				if(ch==s.charAt(i)) {
			
		/*Step 3 - If char is matching increment the count*/
					count++;
				}
			}
			
		/*Step 4 - Print both char and set of count*/
		
			if(count>1) {
			System.out.println(ch + " is present "+ count + " times");
		
			}
		
			
		}
	}
}
