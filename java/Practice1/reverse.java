package Practice1;

public class reverse
{

	public static void main(String[] args)
	{
		String s = "Anand";
		char[] ch = s.toCharArray();
		String rev = "";
		
		for(int i =0;i<s.length();i++)
		{
			rev = s.charAt(i)+rev;
		}
		
	}

 }
