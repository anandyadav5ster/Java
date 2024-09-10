 
import java.util.*;
import java.util.Arrays;
public class Test
{
	
	public static void main(String[] args)
	{
		
		//countCharacterDigitSpecial();
		//checkLeapYear();
		//checkAnangram();
		//removeDuplicateFromSentence();
		//stringSorting();
		//capFirstWord();
		//maximumLengthString();
		//remove_element_from_array();
		//find_missing_number();
		//remove_duplicate_1();
		//remove_duplicate_hashset();
		//check_palindrome();
		//printPrimeNumber();
		//check_number_palindrome();
		// find_factorial();
		
		
	}	
	static void find_factorial(){
		int n =5;
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact = i *fact;
		}
		System.out.println(fact);
	}
	static void check_number_palindrome()
	{
		int n = 121;
		int rev=0;
		int temp =n;
		
		while(temp!=0)
		{
			int digit = temp%10;
			rev = rev*10+digit;
			temp = temp/10;
		}
		System.out.println(rev);
	}
	
		static void printPrimeNumber()
		{
			int n =20;
		
			for(int i=2;i<n;i++)
			{
					int count = 1;	
				for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
				
			}
			if(count==1)
				{
					System.out.println(i+" ");
				}
			}
		}
		static void check_palindrome()
		{
			String s = "Madam";
			s = s.toLowerCase();
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)!=s.charAt(s.length()-1))
				{
					System.out.println("String is not palindrome");
					break;
				}
				else{
					System.out.println("String is palindrome");
					break;
				}
			}
			
		}
		static void remove_duplicate_hashset()
		{
			int[] a= {1,2,3,3,4,4,5};
			int n = a.length;
			
			HashSet<Integer> hs = new HashSet<>();
			for(Integer i : a)
			{
				hs.add(i);
			}
			for(int j: hs)
			{
				System.out.print(j+" ");
			}
		}
		static void remove_duplicate_1()
		{
			int[] a = {1,2,3,3,4,5};
			int j=0;
			for(int i=0;i<a.length-1;i++)
			{
				if(a[i]!=a[i+1])
				{
					a[j++] = a[i];
				}
			}
			a[j] =a[a.length-1];
			for(j=0;j<a.length-1;j++)
			{
				System.out.print(a[j]+"  ");
			}
		}
		static void find_missing_number()
		{
			int[] a = {1,2,4,5};
			int n = a.length;
			int total = ((n+1)*(n+2)/2);
			for(int i=0;i<n;i++)
			{
				total-=a[i];
			}
			System.out.println(total);
		}
		static void remove_element_from_array()
		{
			int[] a= {1,2,3,4,5};
			int target = 3;
			int temp[];
			int j=0;
			for(int i =0;i<a.length;i++)
			{
				if(a[i]!=target)
				{
					a[j++] = a[i];
				}
			}
			a[j] = a[a.length-1];
			for(int i =0;i<j;i++)
			{
				System.out.print(a[i]+"  ");
			}
		}
		static void maximumLengthString()
		{
			String s= "I am in london";
			String[] words = s.split(" ");
			HashMap<String,Integer>hm= new HashMap<>();
			
			for(String word : words)
			{
				hm.put(word,word.length());
			}

			System.out.println(Collections.max(hm.entrySet(),Map.Entry.comparingByValue()).getKey());
		}
		
		static void capFirstWord()
		{
			String sen = "i am in bangalore";
			String[] words = sen.split(" ");
			String res ="";
			for(String word : words)
			{
				res+=word.substring(0,1).toUpperCase()+word.substring(1)+" ";
			}
			System.out.println(res);
		}
		static void stringSorting()
		{
			String[] a = {"Rohit","Kohli","Kuldeep","Bhumrah"};
			String temp;
			for(int i=0;i<a.length;i++)
			{
				for(int j =0;j<a.length-1;j++){
					
					if(a[i].compareTo(a[j+1])>0){
						temp =a[i];
						a[i] = a[j+1];
						a[j+1] = temp;
					}
				}
			}
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+"  ");
			}
		}
		static void removeDuplicateFromSentence()
		{
			String s = "I am am in a a Bangalore";
			s = s.toLowerCase();
			String[] words = s.split(" ");
			LinkedHashSet<String> hs = new LinkedHashSet<>();
			
			for(String word : words)
			{
				hs.add(word);
			}
			System.out.println(hs);
			
			for(String r : hs)
			{
				System.out.print(r+"  ");
			}
		}
	
		static void checkAnangram()
		{
			String s1 = "Race";
			String s2 = "Care";
			s1 = s1.toLowerCase();
			s2= s2.toLowerCase();
			int s1length = s1.length();
			int s2length = s2.length();
			boolean flag = false;
			if(s1length==s2length)
			{
				 char[] s1ch = s1.toCharArray();
				 char[] s2ch = s2.toCharArray();
				 Arrays.sort(s1ch);
				 Arrays.sort(s2ch);
				 flag = Arrays.equals(s1ch,s2ch);
				if(flag)
				{
					System.out.println("String is anagram");
				}
				else{
						System.out.println("String is not anagram");
				}
				 
				 
			}
		}
	
		static void checkLeapYear()
		{
			int year = 2020;
			boolean flag=false ;
			if(((year%4==0) &&(year%100!=0)) || (year%400==0))
			{
				flag = true;
			}
			if(flag)
			{
				System.out.println("Year is leap");
			}
			else{
				System.out.println("Year is not leap");
			}
		}
	
		static void countCharacterDigitSpecial()
		{
			String s = "An@nd@123Wipro";
			int i,alpha,digi,spl;
			alpha=digi=spl=0;
			char ch;
			
			for(i =0;i<s.length();i++)
			{
				ch = s.charAt(i);
				if(ch>='a' && ch<='z' || ch>='A' && ch<='Z')
				{
					alpha++;
				}
				else if(ch>='0' && ch<='9')
				{
					digi++;
				}
				else{
					spl++;
				}
			}
			
			System.out.println("Alpha character is: "+alpha);
			System.out.println("Digi chcracter  is"+digi);
			System.out.println("Special character is "+spl);
			
		}
		

} 
