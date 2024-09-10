import java.util.*;

public class TestTwo{

	public static void main(String[] args){
		// reverseString();
		// reverseSentence();
		// sortString();
		// count_max_sequence();
		// swap_negative_positive_array();
		swap_negative_positive_array_twopointerapproach();

	}

	static void swap_negative_positive_array_twopointerapproach(){
		int[] a = {2,-3,4,-1,6,-4};
		int n = a.length;
		int left =0;
		int right = n-1;
		while(left<right){

			while(a[left]<0 && a[right]<0){
				left++;
			}
			while(a[left]>0 && a[right]>0){
				right--;
			}

			while(a[left]> 0 && a[right]<0){
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
				right--;
			}
			left++;
			right--;
		}

		for(int i:a){
			System.out.print(i+" ");
		}
		
	}
	static void swap_negative_positive_array(){
		int[] a = {2,-3,4,-1,6,-4};
		int n = a.length;
		int j=0;
		for(int i=0;i<n;i++){

			if(a[i]<0){

				if(i!=j){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				j++;
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}

	static void count_max_sequence(){
		String s = "aaabbbccddpppp";
		int n = s.length();
		int maxcount = 1;
		int currcount =1;
		char maxchar = s.charAt(0);
		char currchar = s.charAt(0);

		for(int i=0;i<n;i++){
			currcount =1;
			currchar = s.charAt(i);
			for(int j=i+1;j<=n-1;j++){
				if(currchar ==s.charAt(j)){
					currcount++;
					if(currcount>maxcount){
						maxcount = currcount;
						maxchar = currchar;
					}
				}
				else{
					break;
				}
			}
		}
		System.out.println(maxchar+" "+maxcount);	
	}

	static void sortString(){

		String s = "Anand";
		char[] ch = s.toCharArray();
		for(int i=0;i<s.length();i++){
			for(int j=0;j<s.length()-1;j++){
				if(ch[j]<ch[j+1]){
					char temp = ch[j];
					ch[j] = ch[j+1];
					ch[j+1] = temp;
				}
			}
		}
		
		Arrays.sort(ch);
		System.out.print(ch);
		
		
	}

	static void reverseSentence(){
		String s = "I am in london";
		String[] words = s.split(" ");
		String res = "";
		for(String word : words){
			res = word+" "+res;
		}
		System.out.println(res);
	}

	static void reverseString()
	{
		String s = "Anand";
		char[] ch = s.toCharArray();
		String res = "";
		for(Character c: ch){
			res = c+res;
		}
		System.out.println(res);
	}
}