package javaPractice;

public class FibonacciNumLimited {
	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		
		System.out.print(a+" "+ b+" ");
		
		for(int i = 1;i<=15; i++) {
		int	c = a + b;
			if(c>=100) {
				break;
			}
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}
