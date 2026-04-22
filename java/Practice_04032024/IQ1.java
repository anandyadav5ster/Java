package Practice_04032024;

import java.util.*;
public class IQ1{

	public static void main(String[] args){
		int[] a = {2,2,2,3,4,56,6};
		// remove_duplicate(a);
		 // ArrayList<Integer> b = test();

		// createPositiveArray(b);
		// createNegativeArray(a);
		// int n = a.length;
		// int k = 2;
		// rotateArray(a,0,n-k-1);
		// rotateArray(a,n-k,n-1);
		// rotateArray(a,0,n-1);
		// System.out.println(Arrays.toString())

		majority_Element();
		reverseAlternateWord();

	}

	static void reverseAlternateWord(){
        String str = "Hello Anand How are you";
        String[] words = str.split(" ");
        
        for(int i = 0;i<words.length;i++){
            if(i%2 != 0){
                 words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }
        System.out.println(String.join(" ",words));
    }
	
	static void remove_duplicate(int[] a){

		int rd =0;
		for(int i=1;i<a.length;i++)
		{
			if(a[rd]!=a[i]){
				rd++;
				a[rd] = a[i];
			}
		}
		for(int i=0;i<rd;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	// take a arraylist and dvide into positive and negative list
		public static ArrayList<Integer> test()
		{
		 	ArrayList<Integer> a = new ArrayList<>();
		 	Scanner sc = new Scanner(System.in);
		 	System.out.println("Enter the values ");
		 	for(int i=0;i<6;i++)
		 	{
		 		 String x = sc.nextLine();
		 		 a.add(Integer.parseInt(x));
		 	}
		 	System.out.println("Input array is "+a);
		 	return a;
		 }


		 

		 public static void createPositiveArray( ArrayList<Integer> a)
		 {
		 	ArrayList<Integer> postive = new ArrayList<>();
		 	ArrayList<Integer> negative = new ArrayList<>();
		 	for(Integer j : a){
		 		if(j>=0){
		 			postive.add(j);
		 		}
		 	}
		 	System.out.println("Positive array is "+postive);
		  for(Integer j : a){
		 		if(j<0){
		 			negative.add(j);
		 		}
		 	}
		 	System.out.println("Negtive array is:" +negative);


		}

		 	
	public static void rotateArray(int[] a , int start,int end)
	{
			// int[] a = {12345};

		while(start<end)
		{
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}

	}


	public static void majority_Element()
	{
		int[] a ={3,2,3};
		int n = a.length;
			for(int i=0;i<a.length;i++)
			{
				int count =1;
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						count++;
					}
				}
				if(count>n/2)
				{
					System.out.println(a[i]);
				}
			}

			
		
	}


}