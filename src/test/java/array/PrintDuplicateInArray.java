package array;

import java.util.LinkedHashSet;

public class PrintDuplicateInArray {
	public static void main(String[] args) {
		
		int []a = {1,3,5,1,6,3,7};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for(int i = 0; i<a.length; i++)
		{
			set.add(a[i]);
		}
		
		for (Integer n : set) {
			int count = 0;
			
			for(int i = 0; i<a.length; i++) {
				if(n==a[i]) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(n + " present "+ count+ " time");
			}
		}
		
	}
}
