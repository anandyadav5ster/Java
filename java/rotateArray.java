import java.util.Arrays;

public class rotateArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int n = a.length;
		int k =2;
		 // normalize k
		k =k %n;
		
		
		// rotate complete array
		rotate(a,0,n-k-1);
		rotate(a,n-k,n-1);
		rotate(a,0,n-1);
		System.out.println(Arrays.toString(a));
	}
	
		static void rotate(int[] a, int start,int end){
			
			while(start<end) {
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				start++;
				end--;
			}
		}
}
