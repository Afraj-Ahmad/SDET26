package wrt.special;

public class SeparateSpecialAndNum {
	public static void main(String[] args) {
		
		String s = "a12cb!@$po1";
		String al = "";
		String num = "";
		String spl = "";
		
		for(int i = 0; i<s.length();i++) {
			
			if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='A' && s.charAt(i)<='Z') {
				al= al + s.charAt(i);
			}
			
			else if(s.charAt(i)>='0' && s.charAt(i)<= '9') {
				num = num + s.charAt(i);
			}
			
			else {
				spl = spl + s.charAt(i);
			}
		}
		System.out.println("Alphabet = "+al+ " number = "+num+ " special char = "+spl);
	}
}
