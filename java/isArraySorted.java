
public class isArraySorted {

	public static void main(String[] args) {

//		int[] a = { 30, 23, 31, 32, 43 };
//		boolean result = isSorted(a);
		int[] a = { 29,30, 31, 32, 43 };
		boolean result = isSorted(a);
		System.out.println(result);
	}

	static boolean isSorted(int[] a) {
	
		boolean status = true;
		int n = a.length;
		for (int i = 0; i < n-1; i++) {
			if (a[i] > a[i + 1]) {
				status = false;
			}

		}
		return status;
	}
}
