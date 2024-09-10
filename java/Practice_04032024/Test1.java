
import java.util.*;
public class Test1{

	public static void main(String[] args) {
		// hashset();
		// hashmap();
		// sortArray();
		// sortArray_inbuiltMethod();
		// int[] a = new int[] {-1,-100,3,99};
		// reverseArray(a);
		test();
	}

	static void test(){

			if(0!=0){
				System.out.println("Hi");
			}
			else{
				System.out.println("Bye");
			}
		
	}
	static void reverseArray(int[] a){
		// int[] a = new int[] {20,15,7,34,1,25};
		int k =2;
		k = k%a.length;
		if(k<0){
			k = k+a.length;
		}
		int n = a.length;
		rotateArray(a,0,n-k-1);
		rotateArray(a,n-k,n-1);
		rotateArray(a,0,n-1);
		System.out.println(Arrays.toString(a));
	}

	// reverse array
	static void rotateArray(int[] a,int start,int end){
		
			while(start<end){
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
				start++;
				end--;

			}


	}

	// sort array with inbuilt method

	static void sortArray_inbuiltMethod(){
		int[] a = new int[] {20,15,7,34,1,25};

		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

	static void sortArray(){

		int[] a = new int[] {52,45,32,64,12,87,78,98,23,7};

		for(int i=0;i<a.length;i++)
		{
			for(int j = i+1;j<a.length;j++)
			{
				if(a[i]>a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}



	static void hashset(){

		HashSet<Integer> hs = new HashSet<>();

		hs.add(1);
		hs.add(null);
		hs.add(null);

		System.out.println(hs);
	}

	static void hashmap(){
		HashMap<Integer,String> hm = new HashMap<>();

		hm.put(1,"Raj");
		hm.put(1,"Tom");
		hm.put(2,"vinay");
		hm.put(null,"john");

		System.out.println(hm);
	}
}