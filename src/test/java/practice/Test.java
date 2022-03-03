package practice;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter first value");
		int first = s.nextInt();
		System.out.println("enter last value");
		int last = s.nextInt();

		while(first<=last) {
			System.out.println(first);
			first++;
		}
	}
}

