package javaPractice;

public class ReverseStringWithoutLength {
	public static void main(String[] args) {
		
		String s = "java";
		String rev = "";
		int count = 0;
		char[] ch = s.toCharArray();
		for (char c : ch) {
			count++;
		}
		//System.out.println(count);
		for(int i = count-1; i >=0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.print(rev);
	}
}
