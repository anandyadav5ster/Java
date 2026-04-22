package Practice1;

import java.util.*;
public class practice14{
	
	public static void main(String[] args){
		//reverse_string();
		//reverse_sentence();
		//remove_duplicate_character();
		//remove_duplicate_character_hashset();
		//find_missing_number();
		//captalize_first_word();
		//countWordInString();
		//count_word();
		//maximum_length_string();
		//sort_string();
		//fabonacciSeries();
		//findFactorial();
		//count_alpha_digit_spl();
		//checkLeapYear();
		//checkStringPalindrome();
		//checkPalindromeNumber();
		//printPrimeNumbers();
		//checkAnagram();
		findtheSumCombination();
	}
	
	public static void findtheSumCombination() {
		int[] arr = {2,3,7,6,8,1};
		int target = 9;
		int n = arr.length;
		for(int i =0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				if(arr[i]+arr[j] == target) {
					System.out.println("Number is ("+arr[i]+","+arr[j]+")"+"indexes is ("+i+","+j+")");
				}
			}
		}
	}
	
	public static void printCommonCharacterString()
	{

      String first = "abcbcd";
	  String second = "cdefef";
	  Set<String> res = new HashSet<>();
	  for(int i=0;i<first.length()-1;i++)
	  {
	      for(int j=i+2;j<=second.length();j++)
	      {
	          String substring = first.substring(i,j);
	          if(second.contains(substring)){
	              res.add(substring);
	          }
	      }
	  }
      res.forEach(System.out::println);  
        
	}
	
	public static void checkAnagram()
	{
		String s1 = "cAre";
		String s2 = "rAce";
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1,ch2))
		{
			System.out.println("String is anagram");
		}
		else{
			System.out.println("String is not anagram");
		}
		
	}
	public static void printPrimeNumbers(){
		
		int n =20;
		for(int i=2;i<=n;i++)
		{
			int count =0;
			for (int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==0)
			{
				System.out.print(i+" ");
			}
		}
	}
	
	
	public static void checkPalindromeNumber(){
		int n = 101;
		int temp = n;
		int res =0;
		while(temp!=0)
		{
			int digit = temp%10;
			res = res *10+digit;
			temp = temp/10;
		}
		if(res==n)
		{
			System.out.println(String.format("%d is palindrome",n));
		}
		else{
			System.out.println(String.format("%d is not palindrome",n));
		}
	}
	
	public static void checkStringPalindrome(){
		String s = "Anand";
		s = s.toLowerCase();
		int n = s.length();
		if(s.charAt(0)==s.charAt(n-1))
		{
			System.out.println("String is palindrome");
		}
		else{
			System.out.println("String is not palindrome");
		}
	}
	
	public static void checkLeapYear()
	{
		int y = 1;
		if((y%4==0 && y%100!=0) || y%400==0)
		{
			System.out.println("year is leap");
		}
		else{
				System.out.println("year is not leap");
		}
	}
	
	public static void count_alpha_digit_spl(){
		String s = "An@and@123Wipro";
		int n = s.length();
		int alpha,digit,spl;
		alpha=digit=spl=0;
		for(int i=0;i<n;i++)
		{
			char ch = s.charAt(i);
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
			{
				alpha++;
			}
			else if (ch>='0' && ch<='9')
			{
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
	
	public static void findFactorial(){
		int n =5;
		int fact=1;
		if(n<1)
		{
			System.out.println("Enter a number greater then 1");
		}
		else{
			for(int i=1;i<=n;i++)
			{
				fact = i*fact;
			}
			System.out.println(fact);
		}
	}
	public static void fabonacciSeries(){
		int n = 10;
		int n1 =0;
		int n2 = 1;
		int n3=0;
		while(n!=0)
		{
			System.out.print(n1+" ");
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			n--;
		}
	}
	
	public static void sort_string(){
		
		String[] a= {"Deepak","Amit","Rohit","vipin"};
		int n = a.length;
		String temp;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(a[j].compareTo(a[j+1])>0)
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			
		}
		System.out.println(Arrays.toString(a));
	}
	
	public static void maximum_length_string(){
		String s = "I am am in in Bangalore";
		String[] words = s.split(" ");
		HashMap<String,Integer> hm = new HashMap<>();
		for(String word: words){
				hm.put(word,word.length());
		}
		System.out.println(Collections.max(hm.entrySet(),Map.Entry.comparingByValue()).getKey());
	}

	public static void count_word(){
		String s = "I am am in in Bangalore";
		String[] words = s.split(" ");
		HashMap<String,Integer> hm = new HashMap<>();
		for(String word: words){
			if(hm.containsKey(word))
			{
				hm.put(word,hm.get(word)+1);
			}
			else{
				hm.put(word,1);
			}
		}
		for(Map.Entry<String,Integer>m: hm.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
	}


	public static void countWordInString(){
		String s = "Bangalore";
		char[] ch = s.toCharArray();
		HashMap<Character,Integer> hm = new HashMap<>();
		for(char c: ch){
			if(hm.containsKey(c))
			{
				hm.put(c,hm.get(c)+1);
			}
			else{
				hm.put(c,1);
			}
		}
		for(Map.Entry<Character,Integer>m: hm.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
	}
	
	public static void captalize_first_word(){
		String s = "i am in bangalore";
		String[] words = s.split(" ");
		String res ="";
		for(String word : words)
		{
			res+=word.substring(0,1).toUpperCase()+word.substring(1)+" ";
		}
		System.out.println(res);
	}
	
	public static void reverse_string(){
		String s = "Bangalore";
		String rev = "";
		int n = s.length();
		
		for(int i=0;i<n;i++){
			rev = s.charAt(i)+rev;
		}
		System.out.println(rev);
	}
	
	public static void reverse_sentence(){
		
		String sen = "I am in Bangalore";
		String[] words = sen.split(" ");
		String rev = "";
		for(String word : words){
			rev = word+" "+rev;
		}
		System.out.println(rev);
	}
	
	public static void remove_duplicate_character()
	{
		String s = "Bangalore";
		int n = s.length();
		String rev = "";
		for(int i=0;i<n;i++)
		{
			String c = ""+s.charAt(i);
			if(rev.contains(c))
			{
				continue;
			}
			else{
				rev+=c;
			}
		}
		System.out.println(rev);
	}
	
	public static void remove_duplicate_character_hashset(){
		
		String s = "Bangalore";
		int n = s.length();
		
		HashSet<Character> hs = new HashSet<Character>();
		for(int i=0;i<n;i++)
		{
			hs.add(s.charAt(i));
		}
		for( Character c : hs){
				System.out.print(c+"");
		}
	
	}

	public static void find_missing_number(){
		int[] a = {1,2,4,5};
		int n = a.length;
		int total = ((n+1)*(n+2)/2);
		for(int i:a){
			total-=i;
		}
		System.out.println(total);
	}
}