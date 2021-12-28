package array;

public class SumOfToArray {
	public static void main(String[] args) {
		
		int []a = {1,3,7};
		int []b = {2,4,5,9};
		
		int count = a.length;
		if(a.length<b.length) {
			count = b.length;
		}
		
		for(int i = 0; i<count; i++) {
			try {
				System.out.println("sum = "+(a[i]+b[i]));
			}
			catch (Exception e) {
				if(a.length>b.length) {
					System.out.println("sum = "+ a[i]);
				}else {
					System.out.println("sum = "+ b[i]);
				}
			}
		}
	}
}
