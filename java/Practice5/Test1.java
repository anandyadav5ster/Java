
import java.util.*;
public class Test1{

	public static void main(String[] args){
		// maximumKey();
		// maximum_sequence();
		// sort_string();
		//rotateArray();
		// revereString();
		// reverse_sentence();
		remove_duplicate_using_hashset();

	}

	static void remove_duplicate_using_hashset(){
		String s = "Bangaoreoorre";
		char[] ch = s.toCharArray();
		HashSet<Character> hs = new HashSet<>();

		for(Character c : ch){
			hs.add(c);
		}
		for(Character x: hs){
			System.out.print(x);
		}
	}

	static void reverse_sentence(){
		String s = "I am in london";
		String[] words = s.split(" ");
		String res = "";
		for(String word : words){
			res = word+" "+res;
		}
		System.out.println("Reverse of the sentence is--> "+res);
	}
	static void revereString(){
		String s = "Anand";
		int n = s.length();
		String rev = "";
		char[] ch = s.toCharArray();
		for(int i=0;i<n;i++){
			rev= s.charAt(i)+rev;
		}
		System.out.println("Reverse of the string is "+rev);
	}

	static void remove_duplicate_without_using_hashset(){
		String s = "Bangalore";

	}

	static void rotateArray(){
		int[] a = {1,2,3,4,5};
		int n = a.length;
		int k = 3;
		k = k%n;
		rotate(a,0,k-1);
		rotate(a,k,n-1);
		rotate(a,0,n-1);
		for(int i:a){
			System.out.print(i+" ");
		}

	}
	static void rotate(int[] a,int left,int right){

		while(left<=right){
			int temp = a[left];
			a[left] = a[right];
			a[right] = temp;
			left++;
			right--;
		}
	}

	static void sort_string(){
		String s = "John";
		char[] ch = s.toCharArray();
		int n = s.length();

		for(int i=0;i<n;i++){
			for(int j=0;j<n-1;j++){
				if(ch[j]>ch[j+1]){
					char temp = ch[j];
					ch[j] = ch[j+1];
					ch[j+1] = temp;
				}
			}
		}
		for(Character c : ch){
			System.out.print(c);
		}
		
	}

	static void maximumKey(){
		int[] a = {3,2,3,4};

		int n = a.length;

		HashMap<Integer,Integer> hm= new HashMap<>();

		for(int i : a){
			if(hm.containsKey(i)){
				hm.put(i,hm.get(i)+1);
			}
			else{
				hm.put(i,1);
			}
		}
		for(Map.Entry<Integer,Integer> m : hm.entrySet()){
			System.out.print(m.getKey()+" "+m.getValue()+" ");
		}
		System.out.println("Maximum value is ");
		System.out.print(Collections.max(hm.entrySet(),Map.Entry.comparingByValue()).getKey());
	}

	static void maximum_sequence(){
		String s = "aabbccddddppppp";
		int n = s.length();
		int maxcount =1;
		int currcount =1;
		char maxchar =s.charAt(0);
		char currchar = s.charAt(0);

		for(int i=0;i<n;i++){

			currcount =1;
			currchar = s.charAt(i);
			for(int j=i+1;j<=n-1;j++){
				if(currchar==s.charAt(j)){
					currcount++;
					if(currcount>maxcount){
						maxcount = currcount ;
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



}