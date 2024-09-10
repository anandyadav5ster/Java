import java.util.*;
import java.util.LinkedList;

public class TestClass
{

	public static void main(String[] args)
	{
		//reverseString();
		//reverseSentence();
		//capatalizeFirstLetter();
		//countCharDigiSpl();
		//removeDuplicatesFromSentence();
		//removeDuplicatesFromSentence1();
		// findMissingNumber();
		
	}
	
	public static void findMissingNumber()
	{
		int[] a = {1,2,4,5};
		int n = a.length;
		int total = ((n+1)*(n+2))/2;
		
		for(int i=0;i<n;i++)
		{
			total-=a[i];
		}
		System.out.println(String.format("Missing number is %d",total));
	}
	
	public static void removeDuplicatesFromSentence1()
	{
		String[] a = {"Anand","Raj","Anand"};
		//String[] words = s.split(" ");
		
		HashSet<String> hs= new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		for(String ww:hs)
		{
			System.out.println(ww);
		}
		
	}
	
	public static void removeDuplicatesFromSentence()
	{
		String s = "i am am in london";
		String[] words = s.split(" ");
		LinkedHashSet<String> hs = new LinkedHashSet<>();
		for(String word : words)
		{
			hs.add(word);
		}
		
		for(String ww: hs)
		{
			System.out.print(ww+" ");
		}
	}
	
	public static void reverseString()
	{
		String s = "Anand";
		char[] ch = s.toCharArray();
		String rev = "";
		
		for(int i=0;i<s.length();i++)
		{
			rev = s.charAt(i)+rev;
		}
		System.out.println(rev);
	}
	
	public static void reverseSentence()
	{
		String s= "I am in Bangalore";
		String[] words = s.split(" ");
		
		String rev = "";
		for(String word : words)
		{
			rev = word+" "+rev;
		}
		System.out.println(rev);
	}

	public static void capatalizeFirstLetter()
	{
		String s = "i am in bangalore";
		String[] words = s.split(" ");
		String cap = "";
		for(String word : words)
		{
			cap+=word.substring(0,1).toUpperCase()+word.substring(1)+" ";
		}
		System.out.println(cap);
	}

	public static void countCharDigiSpl()
	{
		String s = "An@nd@123Wipro";
		int i,alph,digi,spl;
		alph=digi=spl=0;
		char ch ;
		
		for(i=0;i<s.length();i++)
		{
			ch = s.charAt(i);
			if((ch>='a' && ch<='z' || ch>='A' && ch<='Z'))
			{
				alph++;
			}
			else if(ch>='0' && ch<='9')
			{
				digi++;
			}
			else{
				spl++;
			}
		}
		System.out.println(alph);
		System.out.println(digi);
		System.out.println(spl);
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

	// public static int findMiddleLinkedList(){
		
	// 	@SuppressWarnings("rawtypes")
	// 	LinkedList linkedList = new LinkedList();
	// 	  @SuppressWarnings("rawtypes")
	// 	LinkedList.Node head = linkedList.head();
	// 	  linkedList.add( new LinkedList.Node("1"));
	// 	  linkedList.add( new LinkedList.Node("2"));
	// 	  linkedList.add( new LinkedList.Node("3"));
	// 	  linkedList.add( new LinkedList.Node("4"));
			
	// 		linkedList.Node slow = head;
	// 		linkedList.Node fast = head;
			
	// 		while(fast!=null && fast.next!=null){
	// 			slow = slow.next;
	// 			fast = fast.next.next;
	// 		}
			
	// 		return slow;
	// 	}
}