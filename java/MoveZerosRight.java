import java.util.*;
public class MoveZerosRight {

	public static void main(String[] args) {
		
		int[] a = {1,0,2,3,0};
		int n = a.length;
		int left = n-1;

		for(int right =n-1;right>=0;right--) {
			if(a[right] != 0) {
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left--;
			}
		
		}
		System.out.println(Arrays.toString(a));
	}

}
