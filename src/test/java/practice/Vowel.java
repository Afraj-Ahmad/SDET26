package practice;

public class Vowel {
	public static void main(String[] args) {
		
	String vovel = "aeiou";
	String name ="afgtajaaeeimmnu";
	
	for(int i = 0; i<vovel.length(); i++) {
		char ch = vovel.charAt(i);
		int count = 0;
		for(int j =0; j<name.length(); j++) {
			char ch1 = name.charAt(j);
			if(ch==ch1) {
				count++;
			}
		}
		if(count>=1) {
			System.out.println(ch+" "+count);
		}
	}
}
}
