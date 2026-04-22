import java.util.*;
public class iq_v1 {
	
	public static void main(String[] args) {
//		reverseAlternateWords();
//		String inputStr = "Delhi";
//		reverse(inputStr);
//		int inputNum = 1234;
//		reverse(inputNum);
//		sumStringArr();
//		calSumAlternate();
//		countOccurence() ;
//		fabonacciSeries();
//		reverseTargetWord("I am Anand", "Anand");
//		isPalindrome("Anand");
//		isPalindrome("Madam");
//		removeDuplicate("Anand");
//		 findDuplicate("Anand");
//		 characterCount("aaabbbcccdd");//   a3b3c3d2
//		 int[] a1 = {23,12,42,9};
//	     int[] a2 = {98,78,45,32};
//	     mergerSortTwoArray(a1,a2);
//		int[] a = {12,13,15,16};
//        findMissingNumber(a);
	}
	static void findMissingNumber(int[] a){
	      
	      int n = a.length;
	      int first = a[0];
	      int last = a[n-1];
	      int expectedSum = ((n+1)*(first+last))/2;
	      int actualSum = 0;
	      for(int i: a){
	          actualSum+=i;
	      }
	      int missingNum = expectedSum-actualSum;
	      System.out.println(missingNum);
	    
	}
	 static void mergerSortTwoArray(int[] a1, int[] a2){
	 int[] newArray = new int[a1.length + a2.length];
     System.arraycopy(a1,0,newArray,0,a1.length);
     System.arraycopy(a2,0,newArray,a1.length,a2.length);
     
     // remove duplicates
     Set<Integer> set = new LinkedHashSet<>();
     for(Integer i: newArray){
         set.add(i);
     }
   //int index =0; Because int is supported an array (int[]) does not have an .add();
     int[] merged = new int[set.size()];
     int index =0;
     for(Integer i : set){
         merged[index] = i;
         index++;
     }
       System.out.println("Ascending order");
     Arrays.sort(merged);
     System.out.println(Arrays.toString(merged));
     System.out.println("Descending order");
     int left = 0; 
     int right = merged.length-1;
     int temp = 0;
     while(left<right){
         temp = merged[left];
         merged[left] = merged[right];
         merged[right] = temp;
         left++;
         right--;
     }
     
      System.out.println(Arrays.toString(merged));
      System.out.println("Second largest element: " + merged[1]);
 }
	static void characterCount(String item){
	    item = item.toLowerCase();
	    HashMap<Character,Integer> hmap = new HashMap<>();
	    for (char ch : item.toCharArray()){
	        hmap.put(ch,(hmap.getOrDefault(ch,0))+1);
	    }
	     System.out.println(hmap);
	     StringBuilder sb = new StringBuilder();
	    for(Map.Entry<Character, Integer> m: hmap.entrySet()){
	       
	             sb.append(m.getKey()).append(m.getValue());
	        
	    }
	     System.out.println(sb);
	    }
	static void findDuplicate(String item){
	    item = item.toLowerCase();
	    HashMap<Character,Integer> hmap = new HashMap<>();
	    for (char ch : item.toCharArray()){
	        hmap.put(ch,(hmap.getOrDefault(ch,0))+1);
	    }
	     System.out.println(hmap);
	     StringBuilder sb = new StringBuilder();
	    for(Map.Entry<Character, Integer> m: hmap.entrySet()){
	        if(m.getValue() == 1){
	             sb.append(m.getKey()).append(m.getValue());
	        }
	    }
	     System.out.println(sb);
	    }
	static void removeDuplicate(String item){
	    item = item.toLowerCase();
	    Set<Character> set = new LinkedHashSet<>();
	    for (char ch : item.toCharArray()){
	        set.add(ch);
	    }
	     System.out.println(set);
	     StringBuilder sb = new StringBuilder();
	     for( Character c : set){
	         sb.append(c);
	     }
	     System.out.println(sb);
	    }
	static void isPalindrome(String item){
	     item = item.toLowerCase();
	     String reverse = new StringBuilder(item).reverse().toString();
	     String result = reverse.equals(item)? "Palindrome":"Not palindrome";
	     System.out.println(result);
	     
	    }
	
	static void reverseTargetWord(String item, String target){
	     
	     String tar = new StringBuilder(target).reverse().toString();
	     String result = item.replaceAll(target,tar);
	     System.out.println(result);
	     
	    }
	static void countOccurence() {
		String str = "DDelhi";
		str = str.toLowerCase();
		char[] ch = str.toCharArray();
		StringBuilder res = new StringBuilder();
		HashMap<Character,Integer> map = new HashMap<>();
		for(char c : ch) {
			map.put(c,map.getOrDefault(c, 0)+1);
		}
//		System.out.println(map);
		for(Map.Entry<Character,Integer> entry: map.entrySet()) {
			res.append(entry.getKey()).append(entry.getValue());
		}
		System.out.println(res);
	}
	
	// reverse alternate words
	
	static void reverseAlternateWords() {
		String str = "Hello Anand . How are you";
		String words[] = str.split(" ");
		
		for(int i = 0;i<words.length;i++) {
			if(i%2 != 0) {
				words[i] = new StringBuilder(words[i]).reverse().toString();
			}
		}
		System.out.println(String.join(" ", words));
	}
	// String reverse generic
	
	static<T> void reverse(T input) {
		
		String item = String.valueOf(input);
		String reversed = new StringBuilder(item.toLowerCase()).reverse().toString();
		
		if(input instanceof Integer) {
			System.out.println(reversed);
		}else if(input instanceof String) {
			System.out.println(reversed);
		} else {
			System.out.println("Input is other type");
		}
	}
	
//	find the sum of the numbers in the string array
	
	static void sumStringArr() {
		String[] arr = {"abc123","bcd324"};
		int n= arr.length;
		int sum = 0;
		
		for(String s: arr) {
			StringBuilder numberOnly = new StringBuilder();
			for( char ch : s.toCharArray()) {
				if(Character.isDigit(ch)) {
					numberOnly.append(ch);
				}
			}
			if(numberOnly.length()>0) {
				sum+=Integer.parseInt(numberOnly.toString());
			}
			
		}
		System.out.println(sum);
	}
	
	static void calSumAlternate() {
		String[] a = {"abc123","xyz233"};
		int sum = 0;
		for( String word: a) {
			String numString = word.replaceAll("[a-zA-Z]","");
			sum+=Integer.parseInt(numString);
		}
		System.out.println(sum);
	}

	static void fabonacciSeries(){
        int n = 5;
       int n1 = 0;
       int n2 = 1;
       while(n>0){
        //   System.out.print(n1+" ");
        System.out.printf("%d ", n1);
           int n3 = n1+n2;
           n1 = n2;
           n2 = n3;
           n--;
       }
    }
}
