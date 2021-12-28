package wrt.special;

public class ToUpperFirstChar {
	public static void main(String[] args) {
		
		String s = "welcome to tyss"; 
		String[] str = s.split(" ");
		for (String string : str) {
		
		for(int i = 0; i<string.length(); i++) {
			
			if(i==0) {
				String s1 = ""+string.charAt(i);
				System.out.print(s1.toUpperCase());
//				
//				char ch = (char)(string.charAt(i)-32);
//				System.out.print(ch);
//				
			}else {
			System.out.print(string.charAt(i));
			}
			}
		System.out.print(" ");	
		}
	}
}
