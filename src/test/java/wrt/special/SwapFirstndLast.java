package wrt.special;

public class SwapFirstndLast {
	public static void main(String[] args) {
		
		String s = "welcome to tyss company";
		String[] str = s.split(" ");
		String temp = str[0];
		str[0] = str[str.length-1];
		str[str.length-1]=temp;
		
		for(int i =0; i <= str.length-1; i++) {
			System.out.print(str[i]+ " "); // company to tyss welcome
		}
	}
}
