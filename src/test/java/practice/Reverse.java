package practice;

public class Reverse {
	public static void main(String[] args) {
		String s ="jarfA";
		char [] ch = s.toCharArray();
		int count = 0;
		String rev = "";
		for (char c : ch) {
			count++;
		}
		for(int i = count-1; i>=0; i--) {
			rev = rev + ch[i];
		}
		System.out.println(rev);
		
	}
	}


