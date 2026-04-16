package Practice1;

import java.util.*;
public class practice2{

	public static void main(String[] args){

		// reverseString();
		// reverse_using_stringbuffer();
		// reverse_using_stringbuilder();
		// reverse_sentence();
		// capatalize_first_word();
		// removeSpecialCharacterFromString();
		// findthePhoneNumber();
		// count_alpha_digit_spl();

		/*int[] a = {1,2,3,4,5};
		int  k=3;
		k = k%a.length;
		if(k<0){
			k = k+a.length;
		}
		rotate(a,0,k-1);
		rotate(a,k,a.length-1);
		rotate(a,0,a.length-1);
		System.out.println("Array after rotate is :"+Arrays.toString(a));
		*/

		// sortArray();
		// sortArray_inbuilt();
		// StringArrayInbuiltMethod();
		// StringArray();
		// count_words_string();
		// countmaximumlengthword();
		// findtheMissingNumber();
		// fabonacciSeries();
		// find_the_factorial();
		// printPrimeNumbers();
		// majority_of_element();
		// find_duplicate_in_String();
		// String matchOne = "caTch";
      	// String matchTwo = "cat";
		// findMatching(matchOne, matchTwo);
		findMatching1();



	}


// find matching character in two string

	static void findMatching1(){
		String s1 = "caTch";
		String s2 = "cat";
		int lengthone = s1.length();
		int lengthtwo = s2.length();
		
		char charone ;
		char chartwo; 

		for(int i=0;i<lengthone || i<lengthtwo;i++)
		{

			if(i<lengthone && i<lengthtwo)
			{
				charone = s1.charAt(i);
				chartwo = s2.charAt(i);
		
				if(charone==chartwo)
				{
					 System.out.print(chartwo);
				}
				else 
				{
	           System.out.print(".");
	        	}
			}
			else{
				  System.out.print("...");
			}
		}
	}

public static void findMatching(String matchOne, String matchTwo) {
  int lengthOne = matchOne.length();
  int lengthTwo = matchTwo.length();
  char charOne;
  char charTwo;

  for(int i = 0; i < lengthOne || i < lengthTwo; i++) {
    if(i < lengthOne && i < lengthTwo) {
        charOne = matchOne.charAt(i);
        charTwo = matchTwo.charAt(i);
        if (charOne == charTwo) {
           System.out.print(charTwo);
        } else {
           System.out.print(".");
        }
    } else {
       System.out.print(".");
    }

  }
}

	static void find_duplicate_in_String(){
		String s = "beautiful beach";
		String res ="";
		char[] ch = s.toCharArray();
		for(int i=0;i<s.length();i++){
			for(int j=i+1;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j)){
					System.out.println(s.charAt(i));
					break;
				
			}
			}
			
		}
		System.out.print(res);

	}

	  public static void removeDuplicate() {
        // remove duplicate of element
        String str = "aaabbcccccc";
        char[] words = str.toCharArray();
        HashSet<Character> hs = new HashSet<>();
        
        for(char ch : words){
            hs.add(ch);
        }
        String output ="";
        for(char ch: hs){
            output = output+ch; 
        }
       System.out.println(output);
    }

	static void majority_of_element(){

		int[] a = {3,2,3,4,4,4,2};
		int n = a.length;
		HashMap<Integer,Integer> hm = new HashMap<>();

		// for(Integer c : a){
		// 	if(hm.containsKey(c)){
		// 		hm.put(c,hm.get(c)+1);
		// 	}
		// 	else{
		// 		hm.put(c,1);
		// 	}
		// }
		 for(Integer no: a){
            hm.put(no,hm.getOrDefault(no,0)+1);
        }
		/*
		for(Map.Entry<Integer,Integer> m: hm.entrySet()){
			System.out.println(m.getKey() +" "+m.getValue());
		}	

		// count maximum length key
		System.out.println("Maximum value key is ");
		System.out.println(Collections.max(hm.entrySet(),Map.Entry.comparingByValue()).getKey());
		*/
		int maxcount = 0;
		int maxkey=0;
		for(Map.Entry<Integer,Integer> m: hm.entrySet()){
			if(m.getValue()>=n/2){
				maxcount = m.getValue();
				maxkey = m.getKey();
			}
		}	

		// count maximum length key
		System.out.println("Maximum value: "+maxcount+" Maximum key is "+ maxkey);
	}


	static void printPrimeNumbers(){
		int n = 10;

		for(int i =2;i<=n;i++){
			int count = 0;
			for(int j =2;j<=i/2;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==0){
				System.out.print(i+" ");
			}
		}
	}

	static void find_the_factorial(){

		int n =5;
		int fact=1;

		if(n>=1){
			for(int i=1;i<=5;i++)
		{
			fact = i*fact;
		}
		}
		else{
			System.out.println("Enter a valid number ");
		}

		
		System.out.println(fact);
	}


	static void fabonacciSeries(){
		int n = 10;
		int n1=0;
		int n2 =1;

		while(n!=0){
			System.out.print(n1+" ");
			int n3 = n1+n2;
			n1 =n2;
			n2 = n3;
			n--;
		}
	}

	static void findtheMissingNumber(){
		int[] a = {1,2,4,5};
		int n = a.length;
		int total = ((n+1)*(n+2))/2;

		for(int i : a){
			total-=i;
		}

		System.out.println(total);
	}

	// count_maimum_length word
	static void countmaximumlengthword(){
		String s = "I am in Bangalore";
		String[] words = s.split(" ");
		HashMap<String,Integer> hm=new HashMap<>();


		for(String word  : words){
			
				hm.put(word,word.length());
			
			
		}

		for(Map.Entry<String,Integer> m : hm.entrySet()){
			System.out.println(m.getKey()+" "+ m.getValue());
		}

		// find the maximum length word

		System.out.println("Maximum length word is ");
			System.out.println(Collections.max(hm.entrySet(),Map.Entry.comparingByValue()).getKey());
	}

	static void count_words_string(){

		String s = "Bangalorrrre";
		s = s.toLowerCase();
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
		for(Map.Entry<Character,Integer> m: hm.entrySet()){
			System.out.println(m.getKey() +" "+m.getValue());
		}	

		// count maximum length key
		System.out.println("Maximum value key is ");
		System.out.println(Collections.max(hm.entrySet(),Map.Entry.comparingByValue()).getKey());
	}


		// sort string array
	static void StringArrayInbuiltMethod(){

		String[] a = {"Raj","Amar","Chandan","Anand"};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
	static void StringArray(){

		String[] a = {"Raj","Amar","Chandan","Anand"};
		int n = a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++){
				if(a[j].compareTo(a[j+1])>0){
				String temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
			}
			
		}
		System.out.println(Arrays.toString(a));
	}

	// sort integer array inbuilt

	static void sortArray_inbuilt(){
		int[] a= {11,10,4,2,9};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		for(int i : a){
			System.out.print(i+" ");
		}
	}

	static void sortArray()
	{
		int[] a= {11,10,4,2,9};
		int n = a.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j =i+1;j<n;j++)
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



	static void reverseString(){
		String s = "Bangalore";
		String res ="";
		for(int i=0;i<s.length();i++){
			res = s.charAt(i)+res;
		}

		System.out.println("Reverse of the string is: "+res);
	}

	// reverse string using StringBuffer class.

	static void reverse_using_stringbuffer(){
		String s = "Bharat";
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
	}
	static void reverse_using_stringbuilder(){
		String s = "Bharat";
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		sb.reverse();
		System.out.println(sb);
	}

	static void reverse_sentence(){
		String s = "I am in Bangalore";
		String[] words = s.split(" ");
		String res ="";
		for(String word : words){
			res = word+" "+res;
		}
		System.out.println(res);
	}

	static void capatalize_first_word(){
		String s = "i am in bangalore";
		String[] words = s.split(" ");
		String res ="";
		for(String word : words){
			res+=word.substring(0,1).toUpperCase()+word.substring(1)+" ";	
		}
		System.out.println(String.format("Result of the string is : %s",res));
	}


	static void removeSpecialCharacterFromString(){

		String s = "An@nd@123+-Wipro";
		String res = s.replaceAll("[^a-zA-Z]+","");
		System.out.println(res);
	}

	static void findthePhoneNumber()
	{
		String s = "+9192@+9789##";
		String res = s.replaceAll("\\D","");
		res = "+"+res;
		System.out.println(res);

		System.out.println(res.getClass().getSimpleName());

		// int ress = Integer.parseInt(res);
		// System.out.println(ress);
	}

	static void count_alpha_digit_spl(){
		String s = "An@nd@+123wiro";
		int alpha,digit,spl;
		alpha=digit=spl=0;
		for(int i=0;i<s.length();i++){

			char ch = s.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
				alpha++;
			}
			else if( ch>='0' && ch<='9'){
				digit++;
			}
			else{
				spl++;
			}
		}

		System.out.println("Alpha characters are :"+alpha);
		System.out.println("Digit count is : "+digit);
		System.out.println("Special character count is: "+spl);
	}


	// rotate array
	static void rotate(int[] a , int start,int end)
	{
		while(start<end){
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}

	}


}