package wrt.special;

public class Pattern {
	public static void main(String[] args) {
		
		String s = "india";
		String temp="";
		
		for(int i =0; i<s.length(); i++) {
			
			temp = temp + s.charAt(i);
			System.out.println(temp);
		}
		
	}
}
