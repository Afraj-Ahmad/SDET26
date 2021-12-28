package wrt.word;

import java.util.LinkedHashSet;

public class PrintDuplicate {
	public static void main(String[] args) {
		
		String st = "Welcome to Bangalore welcome to tyss";
		String s = st.toLowerCase();
		String[] str = s.split(" ");
		
		LinkedHashSet<String>set = new LinkedHashSet<String>();
			
			for(int i = 0; i < str.length; i++) {
				set.add(str[i]);
			}
			for (String sh : set) {
				int count = 0;
				for(int i = 0; i < str.length; i++) {
					if(sh.equals(str[i])) {
						count++;
					}
				}
				if(count>1) {
				System.out.print(sh + " ");
				}
			}
		}
}
