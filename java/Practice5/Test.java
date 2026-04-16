package Practice5;

import java.util.*;
public class Test{
	
	public static void main(String[] args){

	// checkLeapYear();

	// sort_string();
		// rotateCompleteArray();
		// remove_duplicate_without_hashset();

		//swap_negative_positive_array();

		count_character_value();
	}

	static void count_character_value(){
		String s = "London";
		char[] ch =s.toCharArray();

		HashMap<Character, Integer> hm= new HashMap<>();

		for(Character c : ch){
			if(hm.containsKey(c)){
				hm.put(c,hm.get(c)+1);
			}
			else{
				hm.put(c,1);
			}
		}

		for(Map.Entry<Character, Integer> m : hm.entrySet()){
				System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println("Maximum key is "+Collections.max(hm.entrySet(),Map.Entry.comparingByValue()).getKey());
	}

	static void swap_negative_positive_array(){
		int[] a = {-1,2,-3,4,5,-7};
		int n = a.length;
		int j =0;
		for(int i =0;i<=n-1;i++){

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

	static void remove_duplicate_without_hashset(){
		String s = "Londonoooo";
		int n = s.length();
		String res ="";

		for(int i =0;i<n;i++){

			String ch = ""+s.charAt(i);
			if(res.contains(ch)){
				continue;
			}
			else{
				res+=ch;
			}
		}
		System.out.println(res);
	}

	static void rotateCompleteArray(){
		int[] a = {1,2,3,4,5};
		int n = a.length;
		int k= 3;
		rotate(a,0,k-1);
		rotate(a,k,n-1);
		rotate(a,0,n-1);
		for(int i : a){
			System.out.print(i+" ");
		}

	}
	static void rotate(int[] a, int low, int high){

		while(low<=high){
			int temp = a[low];
			a[low] = a[high];
			a[high] = temp;
			low++;
			high--;
		}
	}


	static void sort_string()
	{
		String[] a = {"vijay","Raj","Amar","Jitu"};

		int n = a.length;
		for(int i=0;i<n;i++){

			for(int j=0;j<n-1;j++){
				if(a[j].compareTo(a[j+1])>0){
					String temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(String r : a){
			System.out.print(r+" ");
		}
	}


	static void  checkAnagram(){

	String s1 = "care";
    String s2 = "race";
    char[] ch1 = s1.toCharArray();
    char[] ch2 = s2.toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    
    boolean flag = Arrays.equals(ch1,ch2);
    if(flag){
        System.out.println("Strings are anagram");
    }
    else{
    	 System.out.println("Strings are not anagram");
    }
	}

	static void checkLeapYear(){
		int year = 2024;

		if(year%400==0 && year%100!=0 || year%4==0){
			System.out.println("Year is leap");
		}
		else{
			System.out.println("Year is not leap");
		}
	}
}