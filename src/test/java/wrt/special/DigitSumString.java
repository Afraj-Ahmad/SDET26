package wrt.special;

public class DigitSumString {
	public static void main(String[] args) {
		
		String s = "ab@12$45nf";
		int sum = 0;
		
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<= '9') {
				int n = s.charAt(i) - 48;
				sum = n + sum;
			}
		}
		System.out.println("sum of digit = "+sum);
	}
}
