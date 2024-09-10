import java.util.*;

public class practice4{
	
	public static void main(String[] args ){
		//reverseString();
		// count_max_sequence();
		swap_negative_positive_array();
		//majority_of_element();
		// remove_duplicate_without_using_hashset();
		// remove_duplicate_using_hashset();
		//count_alpha_digit_spl();
		//removeSpecialCharacterFromString();
		//checkAnagram();
		//checkLeapYear();
		//sort_string();
		//rotateCompleteArray();
		// reverse_sentence();
		// findFabonacciSeries();
		// findFactorial();
		// StringPalindrome();
		// numberPalindrome();
		// numberArmstrong(153);
		//printPrimeNumber(20);
		//captalize_first_word();




	}
	static void swap_negative_positive_array(){
		int[] a = {1,2,-3,3,-1,-2};
		int l = a.length;

		int left =0;
		int right = l-1;
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
		for(int i:a){
			System.out.print(i+" ");
		}
	}

	static void remove_duplicate_using_hashset(){
		String s = "India";
		s = s.toLowerCase();
		char[] ch = s.toCharArray();
		HashSet<Character> hs = new HashSet<>();

		for(Character c : ch){
			hs.add(c);
		}
		for(Character i : hs){
		System.out.println(i+" ");
		}
	}

	static void remove_duplicate_without_using_hashset(){
		String s = "India";
		s = s.toLowerCase();
		int n = s.length();
		String res = "";
		for(int i=0;i<n;i++){
			String ch = ""+s.charAt(i);
			if(res.contains(ch)){
				continue;
			}
			else{
				res+=ch;
			}
		}
		System.out.println("new String is-->"+res);
	}

	static void count_max_sequence(){
		String s = "aabbbcccpppppdd";
		int n = s.length();
		int maxcount = 1;
		int currcount =1;
		char maxchar = s.charAt(0);
		char currchar = s.charAt(0);

		for(int i=0;i<n;i++){
			currcount =1;
			currchar = s.charAt(i);
			for(int j =i+1;j<n-1;j++){
				if(currchar==s.charAt(j))
				{
					currcount++;
					if(currcount>maxcount)
					{
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

	static void captalize_first_word(){
		String s = "i am in bangalore";
		String[] words = s.split(" ");
		String res = "";
		for(String word : words){
			res+=word.substring(0,1).toUpperCase()+word.substring(1)+" ";
		}
		System.out.println("New string is-->"+res);
	}

	static void printPrimeNumber(int n){

		for(int i=2;i<=n;i++){
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

	static void numberArmstrong(int n){
		
		int temp =n;
		int sum =0;
		while(temp!=0){
			int digit = temp%10;
			sum = digit*digit*digit+sum;
			temp= temp/10;

		}

		System.out.println("sum is -->"+sum);
		if(sum==n){
			System.out.println(n+"--> is armstrong");
		}
		else{
			System.out.println(n+"--> is not armstrong");
		}

	}

	static void numberPalindrome(){
		int n = 121;
		int temp =n;
		int sum =0;
		while(temp!=0){

			int digit = temp%10;
			sum = sum*10+digit;
			temp = temp/10;

		}
		if(n==sum){
			System.out.println(n+"-->Number is palindrome");
		}
		else{
			System.out.println(n+"-->Number is not palindrome");
		}
	}

	static void StringPalindrome(){
		String s = "Madamn";
		s = s.toLowerCase();
		int n = s.length();
		boolean flag = true;
		for(int i=0;i<n;i++)
		{
			if(s.charAt(0)!=s.charAt(n-1)){

				flag = false;
				break;
			}
		}
		if(flag){
			System.out.println(s+ "-->String is palindrome");
		}
		else{
			System.out.println(s+ "-->String is not palindrome");
		}
	}

	static void findFactorial(){
		int n = 5;
		int fact=1;
		for(int i=1;i<=n;i++){
			fact= i*fact;
		}
		System.out.println("Factorial of the number is-->"+fact);

	}

	static void findFabonacciSeries(){
		int n = 10;
		int n1=0;
		int n2 =1;

		while(n!=0){
			System.out.print(n1+" ");
			int n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			n--;
		}
	}

	static void reverse_sentence(){
		String s = "I am in Bangalore";
		String[] words = s.split(" ");
		String res = "";
		for(String word : words){
			res = word+" "+res;
		}
		System.out.println("Reverse of the string is--> "+res);
	}
	
	static void rotateCompleteArray(){
		int[] a = {1,2,3,4,5};
		int n = a.length;
		int k =3;
		k = k%n;
		if(k<0){
			k = k+n;
		}
		rotate(a,0,k-1);
		rotate(a,k,n-1);
		rotate(a,0,n-1);
		System.out.print(Arrays.toString(a));
	}
	static void rotate(int[] a,int left, int right){
		
		while(left<=right){
			int temp = a[left];
			a[left] =a[right];
			a[right]=temp;
			left++;
			right--;
		}
	}
	
	
	
	static void sort_string(){
		String[] a = {"Raj","Amar","Tanmay","Chandan"};
		int n = a.length;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++){
				if(a[j].compareTo(a[j+1])>0)
				{
					String temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.print(Arrays.toString(a));
	}
	static void checkLeapYear()
	{
		int year = 2024;
		
		if(year%400==0 && year%100!=0 || year%4==0){
			System.out.println(year+" Year is leap: ");
		}
		else{
				System.out.println(year+" Year is not leap: ");
		}
	}
	
	static void checkAnagram(){
		String s1 = "care";
		String s2 ="Race";
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
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
	
	static void removeSpecialCharacterFromString(){
		String s = "Anand@+-Ban@lore";
		String res = s.replaceAll("[^a-zA-Z]+","");
		System.out.println(res);
	}
	
	static void count_alpha_digit_spl(){
		String s = "An@an123wipro";
		int alpha,digit,spl;
		alpha = digit=spl=0;
		
		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			if(ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
				alpha++;
			}
			else if(ch>='0' && ch<='9'){
				digit++;
			}
			else{
				spl++;
			}
		}
		System.out.println("Alpha character count : "+alpha);
		System.out.println("digit character count : "+digit);
		System.out.println("spl character count : "+spl);
	}

	
		
	static void reverseString(){
		String s = "Bangalore";
		String res= "";
		for(int i=0;i<s.length();i++){
			res = s.charAt(i)+res;
		}
		System.out.println("Reverse of the string is:  "+res);
	}

	
}
