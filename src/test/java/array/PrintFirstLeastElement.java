package array;

public class PrintFirstLeastElement {
	public static void main(String[] args) {
		
		int [] a = {20,50,30,10,40,60};
		
		for(int i = 0; i< a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int c : a) {
			System.out.print(c+ " ");
		}
		System.out.println();
		System.out.println("least minimum " + a[0]);
	}
}
