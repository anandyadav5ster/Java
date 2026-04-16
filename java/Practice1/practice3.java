package Practice1;

import java.lang.Math;
import java.util.*;
public class practice3{
	
	public static void main(String[] args){
		//reverseString();
		//reverse_sentence();
		//findFabonacci();
		//findFactorial();
		//StringPalindrome();
		//numberPalindrome();
		//numberArmstrong();
		//printPrimeNumber();
		//captalize_first_word();
		//majority_of_element();
		//remove_duplicate_without_using_hashset();
		//remove_duplicate_using_hashset();
		//find_missing_number();
		// countWordInString();
		//count_word();
		//maximum_length_string();
		//sort_string();
		//count_alpha_digit_spl();
		//checkLeapYear();
		//checkAnagram();
		//removeSpecialCharacterFromString();
		//removespecialcharcterfromphonenumber();
		//removespecialcharcterfromphonenumber();
		//arrlistlistpositiveNegative();
		//rotateCompleteArray();
		//Longest_contiguous_character();
		 
		
	}
	
	
	
	
	static void Longest_contiguous_character(){
		String s = "aaabbccccddbbaaa";
		int n = s.length();
		int maxcount =1;
		int currcount =1;
		char maxchar = s.charAt(0);
		char currchar = s.charAt(0);
		
		for(int i =0;i<n;i++){
			currchar = s.charAt(i);
			currcount =1;
			for(int j=i+1;j<n-1;j++)
			{
				if(currchar==s.charAt(j)){
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
		System.out.println(maxchar +" "+maxcount);
	}
	
	static void rotateCompleteArray(){
		int[] a = {1,2,3,4,5};
		int n = a.length;
		int k =3;
		rotateArray(a, 0,k-1);
		rotateArray(a, k,n-1);
		rotateArray(a, 0,n-1);
		System.out.println(Arrays.toString(a));
	}
	static void rotateArray(int[] a, int start,int end){
		while(start<end){
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}
	
	
	static void arrlistlistpositiveNegative(){
		
		int n = 5;
		int[] a = new int[n];
		Scanner sc = new Scanner(System.in);
for(int i=0;i<n;i++){
	System.out.println("Enter a number");
	a[i] = sc.nextInt();
}

		shiftAll(a, 0, a.length-1);
			System.out.println(Arrays.toString(a));
	}
	static void shiftAll(int[] a, int left, int right){
		
		while(left<=right){
			if(a[left]<0 && a[right]<0){
				left++;
			}
			else if(a[left]>0 && a[right]>0){
				right--;
			}
			else if(a[left]>0 && a[right]<0){
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
				right--;
			}
			else{
				left++;
				right--;
			}
		}
	}
	static void removespecialcharcterfromphonenumber()
	{
		String s = "+91@93+-st9986";
		String res = s.replaceAll("\\D","");
		System.out.println(res);
	}
	
	static void removeSpecialCharacterFromString(){
		String s = "Bangalore@+-K@arnataka";
		String new_res = s.replaceAll("[^a-zA-Z]+","");
		System.out.println(new_res);
		
	}
	
	static void checkAnagram(){
		String s1 = "Care";
		String s2 = "Racee";
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean flag = Arrays.equals(ch1,ch2);
		if(flag){
			System.out.println("String is anagram");
		}
		else{
			System.out.println("String is not anagram");
		}
	}
	static void checkLeapYear(){
		int n = 2021;
		
		if(n%400==0 & n%100!=0 || n%4==0)
		{
			System.out.println("Year is leap");
		}
		else{
			System.out.println("Year is not leap");
		}
	}
	static void count_alpha_digit_spl(){
		String s = "An@nd123@wipro";
		int alpha , digit,spl;
		alpha=digit=spl=0;
		
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
			{
				alpha++;
			}
			else if(ch>='0' && ch<='9'){
				digit++;
			}
			else{
				spl++;
			}
		}
		System.out.println("Alpha count "+alpha);
			System.out.println("Digit count is: "+digit);
				System.out.println("Special character count is "+spl);
	}
	static void sort_string(){
		String[] a = {"Raj","Amar","Chandan","Anand"};
		int n = a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j].compareTo(a[j+1])>0)
				{
					String temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			System.out.print(a[i]+" ");
		}
		
	}
	static void sort_string_1(){
		String s = "Anand";
		char temp  = s.charAt(0);
		char[] a = s.toCharArray();
		int n = a.length;
		Arrays.sort(a);
		for(int i=0;i<s.length();i++){
				System.out.print(a[i]+" ");
		}
	
	}
	static void maximum_length_string(){
		String s = "I am in bangalore";
		String[] words = s.split(" ");
		HashMap<String,Integer> hm = new HashMap<>();
		
		for(String word : words){
			hm.put(word,word.length());
		}
		for(Map.Entry<String,Integer> m: hm.entrySet())
		{
			System.out.println(m.getKey() + " "+m.getValue());
		}
		System.out.print("Maximum length string is : ");
			System.out.print(Collections.max(hm.entrySet(),Map.Entry.comparingByValue()).getKey());
	}
	
	static void count_word(){
		String s = "I am in in London";
		String[] words = s.split(" ");
		HashMap<String,Integer> hm = new HashMap<>();
		
		for(String word : words){
			if(hm.containsKey(word)){
				hm.put(word,hm.get(word)+1);
			}
			else{
				hm.put(word,1);
			}
		}
		for(Map.Entry<String,Integer> m : hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
			System.out.print("maximum key is : ");
		System.out.println(Collections.max(hm.entrySet(),Map.Entry.comparingByValue()).getKey());
		System.out.print("maximum value is : ");
		System.out.println(Collections.max(hm.entrySet(),Map.Entry.comparingByValue()).getValue());
	}
	
	static void countWordInString(){
		String s = "Bangalore";
		char[] ch = s.toCharArray();
		HashMap<Character,Integer> hm = new HashMap<>();
		
		for(Character c: ch){
			if(hm.containsKey(c)){
					hm.put(c,hm.get(c)+1);
			}
		else{
				hm.put(c,1);
		}
		}
		for(Map.Entry<Character,Integer> m : hm.entrySet()){
			System.out.println(m.getKey() +" "+m.getValue());
		}
		
		System.out.println(Collections.max(hm.entrySet(),Map.Entry.comparingByValue()).getKey());
		
	}
	static void find_missing_number(){
		int[] a= {1,2,3,5,6};
		int n = a.length;
		int total = ((n+1)*(n+2))/2;
		for(int i=0;i<n;i++)
		{
			total-=a[i];
		}
		System.out.println(total);
	}
	
	static void remove_duplicate_using_hashset(){
		String s =  "bangalore";
		char[] ch = s.toCharArray();
		LinkedHashSet<Character> hs = new LinkedHashSet<>();
		for(Character c : ch){
			hs.add(c);
		}
		for(Character c : hs){
			System.out.print(c);
		}
	
	}
	static void remove_duplicate_without_using_hashset(){
		String s = "Bangalore";
		int n = s.length();
		String res = "";
		for(int i=0;i<n;i++)
		{
			String ch = ""+s.charAt(i);
			if(res.contains(ch)){
				continue;
			}
			else{
				res = ch+res;
			}
		}
		System.out.println(res);
	}
	
	
	static void majority_of_element(){
		int[] a = {5,2,5};
		int n = a.length;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			if(hm.containsKey(a[i])){
				hm.put(a[i],hm.get(a[i])+1);
			}
			else{
				hm.put(a[i],1);
			}
		}
		System.out.println((hm));
		System.out.println(Collections.max(hm.entrySet(),Map.Entry.comparingByValue()).getKey());
	}
	
	static void captalize_first_word(){
		String s = "i am bangalore";
		String[] words = s.split(" ");
		String res = "";
		for(String word : words){
			res+=word.substring(0,1).toUpperCase()+word.substring(1)+" ";
		}
		System.out.println(res);
	}
	
	static void printPrimeNumber(){
		int n =20;
		
		for(int i=2;i<n;i++){
			int count =1;
			for(int j=2;j<i/2;j++){
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
	
	static void numberArmstrong(){
		int n = 151;
		int res = 0;
		int temp =n;
		while(temp!=0){
			int digit = temp%10;
			res = digit*digit*digit+res;
			temp = temp/10;
		}
		if(res==n){
			System.out.println("Number is Armstrong");
		}
		else{
				System.out.println("Number is not Armstrong");
		}
	}
	
	//numberPalindrome
	static void numberPalindrome(){
		int n = 100;
		int res = 0;
		int temp =n;
		while(temp!=0){
			int digit = temp%10;
			res = digit+res*10;
			temp = temp/10;
		}
		if(res==n){
			System.out.println("Number is plaindrome");
		}
		else{
				System.out.println("Number is not plaindrome");
		}
	}
	// StringPalindrome()
	static void StringPalindrome(){
		String s = "Madamn";
		s = s.toLowerCase();
		int n = s.length();
		
		for(int i=0;i<n;i++){
			char ch = s.charAt(0);
			char ch1 = s.charAt(n-1);
			if(ch==ch1){
				System.out.println("String is palindrome");
				break;
			}
			System.out.println("String is not palindrome");
				break;
		}
	}
	
	// find factorial
	static void findFactorial(){
		int n = 5;
		int fact=1;
		for(int i=1;i<=n;i++){
			fact = i*fact;
		}
		System.out.println("Factorial of the number is : "+fact);
	}
	
	
	// reverse String
	
	static void reverseString(){
		String s = "Bangalore";
		int n = s.length();
		String rev = "";
		for(int i=0;i<n;i++){
			rev = s.charAt(i)+rev;
		}
			System.out.println(String.format("Reverse of the string is:  %s",rev));
	}


// reverse sentence
static void reverse_sentence(){
	String sen = "I am in Bharat";
	String[] words = sen.split(" ");
	String res = "";
	for(String word : words){
		res = word+" "+res;
	}
	System.out.println("Reverse of the sentence is : "+res);
}

static void 	findFabonacci(){
	int n = 10;
	int n1 =0;
	int n2 =1;
	
	while(n!=0){
		System.out.print(n1+" ");
		int n3 = n1+n2;
		n1 = n2;
		n2 = n3;
		n--;
	}
}


}