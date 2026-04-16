package Practice2;

import java.util.*;
public class TestOne{

	public static void main(String[] args){
		// reverseString();
		// reverseSentence();
		// sortString("John");
		// count_max_sequence();
//		removeSpecialCharacterFromString
		// swap_negative_positive_array();
		swap_negative_positive_array_twopointerapproach();
		// majority_of_element();
		// remove_duplicate_without_using_hashset();
		// remove_duplicate_using_hashset();
		// count_alpha_digit_spl();
		// removeSpecialCharacterFromString();
		// checkAnagram();
		// checkLeapYear();
		// sort_string_Array();
		// rotateCompleteArray();
		// rotateCompleteArray_kthposition();
		// findFabonacciSeries();
		// findFactorial();
		// StringPalindrome();
		// StringPalindrome_two_pointer_approach();
		// numberPalindrome();
		// NumberArmstrong(153);
		// printPrimeNumber(20);
		// captalize_first_word();
		// shiftNegativePositiveElment();
		// sort_Array_Integer();
		// sort_String();

	}

	static void sort_Array_Integer(){
		int a[] = { 1, 423, 6, 46, 34, 23, 13, 53, 4 };
		int n = a.length;
		// partion-->quicksort
		quickSort(a,0,n-1);
		printArray(a);
	}

	static void quickSort(int[] a, int low, int high){
		int pi = partition(a,low,high);

		if(low<pi-1){
			quickSort(a,low,pi-1);
		}
		else if(high>pi){
			quickSort(a,pi,high);
		}
	}
	static int partition(int[] a,int low,int high){

		int pivot = a[low];
		while(low<=high){
			while(a[low]<pivot){
			low++;
		}
		while(a[high]>pivot){
			high--;
		}
		if(low<=high){
			int temp = a[low];
			a[low] = a[high];
			a[high] = temp;
			low++;
			high--;
		}
		}
		
		
		return low;
	}

	static void shiftNegativePositiveElment(){
		int[] a = { -1, 2, -3, 4, 5, 6, -7, 8,-6};

		int n = a.length;
		int j =0;
		for(int i=0;i<n;i++){
			if(a[i]<=0){
				if(i!=j){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				j++;
			}
		}
		printArray(a);
		System.out.println("");
		rotateCompleteArray(a);

	}

	static void captalize_first_word(){
		String s = "i am in bangalore";
		String[] words = s.split(" ");
		String res ="";
		for(String word : words){
			res+=word.substring(0,1).toUpperCase()+word.substring(1)+" ";
		}
		System.out.println("Result string is-->"+res);
	}

	static void printPrimeNumber(int n){
		int count =1;
		for(int i=2;i<=n;i++){
			count =1;
			for(int j=2;j<=i/2;j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==1){
				System.out.print(i+" ");
			}
		}
	}
	static void NumberArmstrong(int n){
		int temp = n;
		int sum =0;

		while(temp!=0){
			int digit = temp%10;
			sum = sum+digit*digit*digit;
			temp = temp/10;
		}
		if(sum==n){
			System.out.println("Number is ArmStrong "+n);
		}
		else{
			System.out.println("Number is not ArmStrong "+n);
		}
		
	}

	static void numberPalindrome(){
		int n = 121;
		int temp=n;
		int sum =0;
		while(temp!=0){
			int digit = temp%10;
			sum = sum*10+digit;
			temp = temp/10; 
		}
		if(sum==n){
			System.out.println("Number is palindome "+n);
		}
		else{
			System.out.println("Number is not palindome "+n);
		}
	}

	static void StringPalindrome_two_pointer_approach(){

		String s = "madamn";
		int n = s.length();
		for(int i=0,j=n-1;;i++,j--)
		{
			if(s.charAt(i)!=s.charAt(j)){
				System.out.println(String.format("String %s is not palindrome", s));
				break;
			}
			else{
				System.out.println(String.format("String %s is palindrome", s));
				break;
			}
			
		}
	}

	static void StringPalindrome(){
		String s = "Madam";
		s = s.toLowerCase();
		int n = s.length();
		String rev = "";
		for(int i=0;i<n;i++){
			rev =s.charAt(i)+rev;
		}
		System.out.println(rev);
		if(rev.equals(s)){
			System.out.println(String.format("String %s is palindrome", s));
		}
		else{
			System.out.println(String.format("String %s is not palindrome", s));
		}


	}

	static void findFactorial(){
		int n = 5;
		int fact=1;
		for(int i=1;i<=5;i++){
			fact = i*fact;
		}
		System.out.print(String.format("Factorial of the number is %d",fact));
	}

	static void findFabonacciSeries(){
		int n = 10;
		int n1 =0;
		int n2 =1;
		int n3 =0;

		while(n!=0){
			System.out.print(n1+" ");
			n3 = n1+n2;
			n1= n2;
			n2=n3;
			n--;
		}
	}

	static void rotateCompleteArray_kthposition(){
		int[] a = {1,2,3,4,5};
		int n = a.length;
		int k =3;
		k = k%n;
		if(k<0){
			k =k+n;
		}
		rotate(a,0,k-1);
		rotate(a,k,n-1);
		rotate(a,0,n-1);
		printArray(a);
	}
	static void rotate(int[] a, int low,int high){

		while(low<=high){
			int temp = a[low];
			a[low] = a[high];
			a[high] = temp;
			low++;
			high--;
		}
	}


	static void rotateCompleteArray(){
		int[] a = {1,2,3,4,5};
		int low =0;
		int high = a.length-1;
		while(low<=high){
			int temp = a[low];
			a[low] = a[high];
			a[high] = temp;
			low++;
			high--;
		}
		printArray(a);
	}
	static void rotateCompleteArray(int[] a){
		int low =0;
		int high = a.length-1;
		while(low<=high){
			int temp = a[low];
			a[low] = a[high];
			a[high] = temp;
			low++;
			high--;
		}
		printArray(a);
	}



	static void sort_string_Array(){
		String[] a = {"Raj","Amar","Chandan","Anand"};
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
		for(String s : a){
			System.out.print(s+" ");
		}
		
	}

	static void checkLeapYear(){
		// int year = 2024;
		int year = 2023;

		if(year%400==0 && year%100!=0 || year%4==0){
			System.out.println(String.format("Year %d is leap year" , year));
		}
		else{
			System.out.println(String.format("Year %d is not leap year" , year));
		}
	}
	static void checkAnagram(){
		String s1 = "Race";
		String s2 = "Care";
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean flag = Arrays.equals(ch1,ch2);
		if(flag){
			System.out.println(String.format("String %s & %s are anagram" ,s1,s2));
		}
		else{
			System.out.println(String.format("String %s & %s are not anagram" ,s1,s2));
		}
	}

	static void removeSpecialCharacterFromString()
	{
		String s = "An@an@+-{]london";
		String res = s.replaceAll("[^a-zA-Z]+","");
		System.out.println("result of the string is --> "+res);
		  String number = "+91+1234#1234";
        number=number.replaceAll("[\\D]", "");
         System.out.println(number);
	}

	static void count_alpha_digit_spl(){
		String s = "An@and@123+wipro";
		int n = s.length();
		int alpha,digit,spl;
		alpha=digit=spl=0;

		for(int i=0;i<n;i++)
		{
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
		System.out.println("Count of alpha character is -->"+alpha);
		System.out.println("Count of digit is->"+digit);
		System.out.println("Count os special character is-->"+spl);

	}


	static void remove_duplicate_using_hashset(){
		String s = "bangalore";
		char[] ch = s.toCharArray();
		HashSet<Character> hs = new HashSet<>(); 
		for(Character c : ch){
			hs.add(c);
		}
		for(Character cc: hs){
			System.out.print(cc);
		}
		System.out.println("");
		ArrayList<Character> al = new ArrayList<Character>(hs);
		Collections.sort(al);
			for(Character a: al){
			System.out.print(a);
		}
		// System.out.println(al);

	}

	static void remove_duplicate_without_using_hashset(){
		String s = "Bangalore";
		int n = s.length();
		String res ="";
		for(int i=0;i<n;i++){
			String ch = ""+s.charAt(i);
			if(res.contains(ch)){
				continue;
			}
			else{
				res+=ch;
			}
		}
		System.out.println("String after remove duplicates->"+res);
	}

	static void majority_of_element(){
		int[] a = {3,2,3,3};
		int n = a.length;
		HashMap<Integer,Integer> hm = new HashMap<>();

		for(int i: a){
			if(hm.containsKey(i)){
				hm.put(i,hm.get(i)+1);
			}
			else{
				hm.put(i,1);
			}
		}
		System.out.print("maximum key is-->");
		System.out.println(Collections.max(hm.entrySet(),Map.Entry.comparingByValue()).getKey());
	}

	static void swap_negative_positive_array_twopointerapproach(){
		int[] a = {-1,2,-3,4,5,-7};
		int n = a.length;
		int left =0;
		int right = n-1;
		while(left<=right)
		{
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
		System.out.println(Arrays.toString(a));
	}

	static void swap_negative_positive_array(){
		int[] a = {-1,2,-3,4,5,-7};
		int n = a.length;
		int j =0;
		for(int i =0;i<=n-1;i++){

			if(a[i]<0){
				if(i!=j){
					int temp=a[i];
					a[i] = a[j];
					a[j] = temp;
				}
				j++;
			}
			
		}
		printArray(a);
	}
	static void printArray(int[] a){
		for(int i: a){
			System.out.print(i+" ");
		}
		
	}
	static void count_max_sequence(){
		String s = "aabbccpppppqq";
		int n = s.length();
		int maxcount = 1;
		int currcount =1;
		char maxchar = s.charAt(0);
		char currchar = s.charAt(0);

		for(int i=0;i<n;i++)
		{
			currcount =1;
			currchar = s.charAt(i);
			for(int j=i+1;j<n;j++){
				if(currchar==s.charAt(j)){
					currcount++;
					if(currcount>maxcount){
						maxcount = currcount;
						maxchar =  currchar;
					}

				}
				else{
						break;
					}
			}
		}
		System.out.println(maxcount+" "+ maxchar);
	}

	static void reverseString(){
		String s = "Bangalore";
		int n = s.length();
		String res ="";
		for(int i=0;i<n;i++){
			char ch = s.charAt(i);
			res = ch+res;
		}
		System.out.println("Reverse of the string is-->"+res);
	
	}

	static void reverseSentence(){
		String s = "I am in Bangalore";
		String[] words = s.split(" ");
		String res ="";
		for(String word : words){
			res = word+" "+res;
		}
		System.out.println("Reverse of the sentence is-->"+res);

	}

	static void sortString(String s){

		char[] ch = s.toCharArray();

		Arrays.sort(ch);
		String sorted = new String(ch);
		System.out.println("Sorted String is->"+sorted);
	}

	static void sort_String(){
		String s = "John";
		char[] ch = s.toCharArray();
		int n = s.length();
		for(int i=0;i<n;i++){
			for (int j=0;j<n-1;j++){
				if(ch[j]>ch[j+1]){
					char temp = ch[j];
					ch[j] = ch[j+1];
					ch[j+1] = temp;
				}
			}
		}

		for(Character c: ch){
			System.out.print(c);
		}
		
	}
}

