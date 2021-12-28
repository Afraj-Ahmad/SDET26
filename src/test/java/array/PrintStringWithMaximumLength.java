package array;

public class PrintStringWithMaximumLength {
	public static void main(String[] args) {
		
		String[] str = {"abc","Hi", "mango", "j","tyss","abcde"};
		
		String max = str[0];
		
		for(int i = 1; i<str.length; i++) {
			if(max.length() < str[i].length()) {
				
				max = str[i];
			}
		}
		for(int j = 0; j<str.length; j++) {
			if(max.length() == str[j].length()) {
				System.out.println(str[j]+ " ");
			}
		}
	}
}
