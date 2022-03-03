package array;

public class PrintStringWithMinimumLength {
	public static void main(String[] args) {
		
		String[] str = {"abc","Hi", "mango", "j","tyss","abcde","b"};
		
		String min = str[0];
		
		for(int i = 1; i<str.length; i++) {
			if(min.length() < str[i].length()) {
				
				min = str[i];
			}
		}
		for(int j = 0; j<str.length; j++) {
			if(min.length() == str[j].length()) {
				System.out.println(str[j]+ " ");
			}
		}
	}
}
