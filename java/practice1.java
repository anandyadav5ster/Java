import java.util.*;
public class practice1{
	
	
	public static void main(String[] args){
		//reverseString();
		//reverse_sentence();
		//count_words_string();
		//maximum_word_count();
		//remove_duplicate_without_hashSet();
		//remove_duplicate_without_hashSet();
		//array_find_missing_number();
		//capatalize_first_word();
		//maximum_length_string();
		//sortString();
		//fabonacciSeries();
		//find_the_factorial();
		//find_the_factorial();
		//count_alpha_digit_spl();
		//printPrimeNumbers();
		majority_of_element();
	}
	
	static void majority_of_element(){
		int[] a = {3,2,3,3};
		int n = a.length;
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<a.length;i++){
			if(hm.containsKey(a[i])){
				hm.put(a[i],hm.get(a[i])+1);
			}
			else{
				hm.put(a[i],1);
			}
		}
		System.out.println(hm);
		int maxcount=0;
		int maxkey =0;
		for(Map.Entry<Integer,Integer> m:hm.entrySet())
		{
			if(m.getKey()>maxcount){
				maxcount = m.getValue();
				maxkey = m.getKey();
			}
		}
		System.out.println(maxcount+" "+maxkey);
	}
	
	static void printPrimeNumbers(){
		int n = 20;
		for(int i=2;i<n;i++){
			int count =1;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					count++;
					break;
				}
			}
			if(count==1){
				System.out.print(i+" ");
			}
		}
	}
	
	static void count_alpha_digit_spl()
	{
		String s = "An@and@a123wipro";
		int alpha,digit,spl;
		alpha=digit=spl=0;
		
		for(int i=0;i<s.length();i++){
			
			char ch = s.charAt(i);
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
				alpha++;
			}
			else if(ch>='0' && ch<='9'){
				digit++;
			}
			else{
				spl++;
			}
		}
		System.out.println(alpha);
		System.out.println(digit);
		System.out.println(spl);
	}
	
	// Reverse string
	
	static void reverseString(){
		
		String s = "Bangalore";
		
		String res = "";
		for(int i=0;i<s.length();i++){
			res = s.charAt(i)+res;
		}
		System.out.println(res);
	}
	
	
	static void reverse_sentence(){
		
		String sen = "I am in Bangalore";
		String[] words = sen.split(" ");
		String res = "";
		
		for(String word :words){
			res = word+" "+res;
		}
		System.out.println(res);
	}
	
	static void count_words_string(){
		String s = "Bangalooooore";
		char[] ch = s.toCharArray();
		HashMap<Character,Integer> hm = new HashMap<>();
		for(Character c : ch){
			if(hm.containsKey(c)){
				hm.put(c,hm.get(c)+1);
			}
			else{
				hm.put(c,1);
			}
		}
		/*for(Map.Entry<Character,Integer> m: hm.entrySet()){
			System.out.println(m.getKey() + " "+ m.getValue());
		}*/
		
		// find the maximumvalue of string
		int maxcount =0;
		char maxchar = 0;
		for(Map.Entry<Character,Integer> m: hm.entrySet()){
			if(m.getValue()>maxcount){
				maxcount = m.getValue();
				maxchar = m.getKey();
				
			}
			
		}
		System.out.println(maxchar + " "+ maxcount);
	}
	
	static void maximum_word_count(){
		
	String sen = "I am am in Bangalore";
	String[] words = sen.split(" ");
	
	HashMap<String,Integer> hm= new HashMap<>();
	
	for(String word : words){
		
		if(hm.containsKey(word)){
			hm.put(word,hm.get(word)+1);
		}
		else{
			hm.put(word,1);
		}
	}
	
	int maxcount =0;
	String maxstring = "";
	for(Map.Entry<String,Integer> m : hm.entrySet()){
		
		if(m.getValue()>maxcount){
			maxcount = m.getValue();
			maxstring = m.getKey();
		}
		
	}
	
	System.out.println(maxstring+" "+maxcount);
	}
	
	static void remove_duplicate_without_hashSet(){
		String s = "Bangalore";
		char[] ch = s.toCharArray();
		String result ="";
		for(int i=0;i<s.length();i++){
			
			String c = ""+s.charAt(i);
			
				if(result.contains(c)){
					continue;
				}
				else{
					result+=c;
				}
			
		}
		System.out.println(result);
		
	}
	
	static void remove_duplicate_using_hashset(){
		
		String s = "Bangalore";
		int n = s.length();
		HashSet<Character> hs = new HashSet<>();
		for(int i =0;i<n;i++){
			hs.add(s.charAt(i));
		}
		System.out.println(hs);
	}

	static void array_find_missing_number(){
		int[] a = {1,2,4,5};
		int n = a.length;
		int total = ((n+1)*(n+2)/2);
		
		for(int i: a){
			total-=i;
		}
		System.out.println(total);
	}

	static void capatalize_first_word(){
		
		String s = "i am bangalore";
		String[] words = s.split(" ");
		String res ="";
		for(String word : words){
			res+=word.substring(0,1).toUpperCase()+word.substring(1)+" ";
		}
		System.out.println(res);
	}

	static void maximum_length_string()
	{
		String sen = "I am am in Bangalore";
		String[] words = sen.split(" ");
		
		HashMap<String,Integer> hm= new HashMap<>();
		
		for(String word : words){
			hm.put(word,word.length());
		}
		
		System.out.println(Collections.max(hm.entrySet(),Map.Entry.comparingByValue()).getKey());
	}

	static void sortString(){
		String[] a = {"Rohit","Kohli","Kuldeep","Bhumrah"};
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-1;j++){
				if(a[j].compareTo(a[j+1])>0)
				{
					String temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

	static void fabonacciSeries(){
		
		int n = 10;
		int n1 =0;
		int n2=1;
		
		while(n!=0){
			System.out.print(n1+",");
			int n3 = n1+n2;
			n1=n2;
			n2=n3;
			n--;
		}
	}

	static void find_the_factorial(){
		int n = 5;
		int fact=1;
		if(n>1){
			for(int i=1;i<n+1;i++){
				fact = i*fact;
			}
		}
	else{
		System.out.println("Enter a number greater that 1");
	}
		System.out.println(fact);
	}
}