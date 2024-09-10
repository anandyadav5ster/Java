import java.lang.reflect.Array;
import java.util.*;


public class Test2{
	
	public static void main(String[] args){
		// majority_of_element();
		// majority_Element_1();
		//remove_duplicate_using_hashset();
		//remove_duplicate_using_without_hashset();
		//findMiddleLinkedList();
		//find_missing_number();
		//reverseString();
		//reverseSentence();
		//captalize_first_word();
		//countWordInString();
		//count_word();
		//maximum_length_string();
		//sort_string();
		//fabonacciSeries();
		
		//findFactorial();
		//count_alpha_digit_spl();
		//checkLeapYear();
		//checkPalindromeNumber();
		//checkStringPalindrome();
		//printPrimeNumbers();
		//checkAnagram();
		// removeSpecialCharacterFromString();
		// removespecialcharcterfromphonenumber();
		//arrlistlistpositiveNegative();
		Longest_contiguous_character();
        }
		
		public static void Longest_contiguous_character(){
			String s = "aaabbccccddbbaaa";
			int n = s.length();
			int maxcount = 1;
			int currcount =1;
			char maxchar = s.charAt(0);
			char currchar = s.charAt(0);

			for(int i=0;i<n;i++){
				currchar = s.charAt(i);
				currcount =1;
				for(int j=i+1;j<n;j++){
					if(currchar==s.charAt(j)){
						currcount++;
						if (currcount>maxcount) {
							maxcount = currcount;
							maxchar = currchar;
						}
					}
					else{
						break;
					}
				}
			}
			System.out.println(maxchar + " " + maxcount);
		}

		public static void findPairSum(){
			int[] a = {1,2,3,4,5,9,6,10,12};
			int target =15;
			int n = a.length;
			
			for(int i=0;i<n;i++){
				
				for(int j=i+1;j<n-1;j++){
					if(a[i]+a[j]==target){
						System.out.println(a[i]+" "+a[j]);
					}
				}
			}
		}

		public static void majority_Element_1(){
			int[] nums = {3,2,3,3,3};
			HashMap<Integer,Integer> numFreq = new HashMap<>();
			   for(int num : nums) {
				   if (!numFreq.containsKey(num)) {
					   numFreq.put(num, 1);                    
				   }
				   else {
					   numFreq.put(num, numFreq.get(num) + 1);
				   }
				   // if (numFreq.get(num) > (nums.length / 2)) 
				   //     System.out.println(num);
					
				   
		   
			   }
			   System.out.print("Key is: ");
			   System.out.println(Collections.max(numFreq.entrySet(),Map.Entry.comparingByValue()).getKey());
			   System.out.print("value is: ");
			 System.out.println(Collections.max(numFreq.entrySet(),Map.Entry.comparingByValue()).getValue());
		}



		public static void majority_of_element()
		{
			int[] a = {3,2,3,4,4};
			int n = a.length;
			HashMap<Integer,Integer> hm = new HashMap<>();
			for(int i=0;i<n;i++)
			{
				hm.put(a[i],hm.getOrDefault(a[i], 0)+1);
			}
			n = n/2;
			for(Map.Entry<Integer,Integer> m : hm.entrySet()){
				if(m.getValue()>n){
					System.out.println(m.getKey() + " "+m.getValue());
				}
				else{

				}
			}

		}

		public static void arrlistlistpositiveNegative(){
			Scanner sc = new Scanner(System.in);
			ArrayList<Integer> alist = new ArrayList<>();
			for(int i =0;i<6;i++)
			{
				System.out.println("Enter a number ");
				int c = Integer.parseInt(sc.nextLine());
				alist.add(c);
			}
			System.out.println(alist);
			ArrayList<Integer> positive = new ArrayList<>();
		ArrayList<Integer> negative = new ArrayList<>();
		
		for(int i: alist){
		    if(i<0){
		        positive.add(i);
		    }
		    else{
		        negative.add(i);
		    }
		}
			System.out.println(positive);
				System.out.println(negative);
			
			
			
			
		}


		// remove special character from phone number
		//This will replace all non digit characters with space but then for your additional "+" in the beginning ,you may need to add it as a prefix to the //result.
			public static void removespecialcharcterfromphonenumber(){
				String no = "+9192@95/52";
				String result = no.replaceAll("\\D","");
					System.out.println(result);
			}
		// remove special character and digit
		public static void removeSpecialCharacterFromString(){
			String s = "An@and@/123Wipro";
			String result = s.replaceAll("[^a-zA-Z ]+","");
			System.out.println(result);
		}
		// check string is anagram or not 
		
		public static void checkAnagram(){
			String s1 = "care";
			String s2 ="Race";
			s1= s1.toLowerCase();
			s2 = s2.toLowerCase();
			if(s1.length()==s2.length()){
				
				char[] ch1 = s1.toCharArray();
				char[] ch2 =s2.toCharArray();
				Arrays.sort(ch1);
				Arrays.sort(ch2);
				boolean flag= Arrays.equals(ch1,ch2);
				if(flag){
					System.out.println("Strings are anagram");
				}
				else{
						System.out.println("Strings are not anagram");
				}
			}
		}
		
		// print prime numbers
		
		public static void printPrimeNumbers(){
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
		
		public static void checkStringPalindrome(){
			String s = "Madan";
			s = s.toLowerCase();
			int n = s.length();
			for(int i=0;i<n;i++)
			{
				if(s.charAt(i)!=s.charAt(n-1))
				{
				System.out.println("String is not palindrome");
				break;
			   }
			  else
			  {
				System.out.println("String is palindrome");
				break;
			}
			}
		}

			// check number is palindrome or not 
			public static void checkPalindromeNumber(){
				int n = 110;
				int temp =n;
				int result =0;
				while(temp!=0){
					int digit = temp%10;
					result = result*10+digit;
					temp= temp/10;
				}
				System.out.println(result);
				if(result==n){
					System.out.println("Number is palindrome");
				}
				else{
					System.out.println("Number is not palindrome");
				}
			}
		
		// check leap year
		public static void checkLeapYear(){
			int y = 1900;
			
			if(y%4==0 && y%100!=0 || y%400==0){
				System.out.println(String.format("Year %d is leap",y));
			}
			else{
				System.out.println(String.format("Year %d is not leap",y));
			}
			
		}
		
		
		//count alpha,digit,special character in string
			
			public static void count_alpha_digit_spl(){
				String s = "An@and@a123wipro";
				int alpha,digit,spl;
				alpha=digit=spl=0;
				int n = s.length();
				for(int i=0;i<n;i++){
					char ch = s.charAt(i);
					if ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
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
		
		public static void findFactorial(){
			int n = 5;
			int fact=1;
			for(int i=1;i<=n;i++){
				fact= i*fact;
			}
			System.out.println(fact);
		}
		
		public static void fabonacciSeries()
		{
			int n =10;
			int n1=0;
			int n2 =1;
			
			while(n!=0){
				System.out.print(n1+" ");
				int n3=n1+n2;
				n1=n2;
				n2 =n3;
				n--;
			}
		}
		
		//sort string 
		public static void sort_string(){
			String[] a = {"Rohit","Kohli","Kuldeep","Bhumrah"};
			String temp;
			int n= a.length;
			for(int i=0;i<n;i++){
				for(int j =0;j<n-1;j++){
					if(a[j].compareTo(a[j+1])>0){
						temp =a[j];
						a[j] =a[j+1] ;
						a[j+1] =temp;
					}
				}
			}
			System.out.println(Arrays.toString(a));
		}
		
		// maximum length string
		public static void maximum_length_string(){
			String sen = "I am in Bangalore";
				String[] words = sen.split(" ");
				HashMap<String,Integer> hmap = new HashMap<>();
				for (String word: words){
						hmap.put(word,word.length());
				}
				for(Map.Entry<String,Integer>m: hmap.entrySet()){
					System.out.println(m.getKey()+" "+m.getValue());
				}
				System.out.println(Collections.max(hmap.entrySet(),Map.Entry.comparingByValue()).getKey());
		}
		
		// count word in sentence
			public static void count_word(){
				String sen = "I am in Bangalore";
				String[] words = sen.split(" ");
				HashMap<String,Integer> hmap = new HashMap<>();
				for (String word: words){
					if(hmap.containsKey(word)){
						hmap.put(word,hmap.get(word)+1);
					}
					else{
						hmap.put(word,1);
					}
				}
				for(Map.Entry<String,Integer>m: hmap.entrySet()){
					System.out.println(m.getKey()+" "+m.getValue());
				}
			}
		// count words in String
	public static void countWordInString(){
		String str = "Bangalore";
		char[] ch = str.toCharArray();
		HashMap<Character,Integer> map = new HashMap<>();
		
		for (Character c: ch)
		{
			if(map.containsKey(c)){
				map.put(c,map.get(c)+1);
			}
			else{
				map.put(c,1);
			}
		}
	for (Map.Entry<Character,Integer> m: map.entrySet()){
		System.out.print(m.getKey()+" "+m.getValue());
	}
	}	
		
	//captalize first word in sentence	
	public static void captalize_first_word(){
		
		String str = "i am in bangalore";
		String[] words = str.split(" ");
		String res = "";
		
		for(String word: words)
		{
			res+=word.substring(0,1).toUpperCase()+word.substring(1)+" ";
		}
		System.out.println(res);
	}	
		
	// Reverse Sentence	
	public static void reverseSentence(){
		String sen = "I am in Bangalore";
		String[] words = sen.split(" ");
		String rev ="";
		for(String word : words){
			rev = word+" "+rev;
		}
		System.out.print(rev);
	}
		
		
// reverse string
public static void reverseString(){
	 String str = "Bangalore";
	 int n = str.length();
	 String rev ="";
	 for (int i=0;i<n;i++){
		 rev = str.charAt(i)+rev;
	 }
	 System.out.println(rev);
}	
	
	
	// remove duplicate from string
	public static void remove_duplicate_using_hashset(){
		String s = "Bangalore";
		int n = s.length();
		
		LinkedHashSet<Character> hs = new LinkedHashSet<>();
		
		for (int i=0;i<n;i++){
			hs.add(s.charAt(i));
		}
		
		System.out.println(hs);
		for (Character c : hs){
			System.out.print(c);
		}
		
	}
	
	public static void remove_duplicate_using_without_hashset(){
		
		String s = "Bangalore";
		int n = s.length();
		String result ="";
		for(int i=0;i<n;i++){
			String ch = ""+s.charAt(i);
			if(result.contains(ch))
			{
				continue;
			}
			else{
				result+=ch;
			}
		}
		System.out.println(result);
	}
	
	public static void find_missing_number()
{
		
		int[] a = {1,2,4,5};
		int n = a.length;
		int total = ((n+1)*(n+2)/2);
		
		for (int i=0;i<a.length;i++){
			total-=a[i];
		}
		System.out.println(total);
	}
	
	
	
}

